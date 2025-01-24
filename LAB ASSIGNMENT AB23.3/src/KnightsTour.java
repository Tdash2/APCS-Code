import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class KnightsTour {

    private int[][] moves = {{2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
    private int move;
    private int[][] board, accessBoard;
    String file;

    void makeBoard() {
        board = new int[8][8];
        move = 0;
    }

    public KnightsTour(String file){
        this.file = file;
    }



    public void play(){
        makeBoard();
        readFile();
        int[] position = initialPosition();

        for (int i = 1; i < 64; i++) {
            position = nextMove(position);
        }
        printBoard();
    }



    void readFile() {
        try {
            Scanner in = new Scanner(new File(file));
            accessBoard = new int[8][8];

            for(int row = 0; row < 8; row++) {
                for(int col = 0; col < 8; col++) {
                    accessBoard[row][col] = in.nextInt();
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] initialPosition() {
        Random generator = new Random();
        int[] pos = new int[2];
        pos[0] = generator.nextInt(8);
        pos[1] = generator.nextInt(8);
        board[pos[0]][pos[1]] = ++move;
        return pos;
    }

    public int[] nextMove(int[] pos) {
        int xPos = pos[0];
        int yPos = pos[1];
        int access = 8;

        for (int i = 0; i < 8; i++) {
            int newX = xPos + moves[i][0];
            int newY = yPos + moves[i][1];
            int newAccess = getAccessibility(newX, newY);

            if (inRangeAndEmpty(newX, newY) && newAccess < access) {
                pos[0] = newX;
                pos[1] = newY;
                access = newAccess;
            }
        }

        board[pos[0]][pos[1]] = ++move;
        return pos;
    }

    private int getAccessibility(int x, int y) {
        int access = 0;
        for (int i = 0; i < 8; i++) {
            if (inRangeAndEmpty(x + moves[i][0], y + moves[i][1]))
                access++;
        }
        return access;
    }

    private boolean inRangeAndEmpty(int x, int y) {
        return (x < 8 && x >= 0 && y < 8 && y >= 0 && board[x][y] == 0);
    }

    public void printBoard() {
        System.out.println("    1    2    3    4    5    6    7    8");
        System.out.println();
        for (int i = 0; i < board.length; i ++){
            System.out.print(i + 1 + "   ");
            for (int j = 0; j < board[0].length; j++){
                System.out.printf("%-5d", board[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println();
        System.out.println(move + " squares were visited");
    }
}

