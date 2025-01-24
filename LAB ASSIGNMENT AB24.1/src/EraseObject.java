import java.util.Scanner;
import java.io.*;

public class EraseObject {
    char[][] picture;
    static Scanner key = new Scanner(System.in);

    public static void run(String File) {
        EraseObject erase = new EraseObject();

        erase.loadFile(File);
        System.out.println("Image before an erasure\n");
        while (true) {
            erase.print();
            System.out.print("Enter y-coordinate (row) of point to erase: ");
            int r = key.nextInt();
            System.out.println();
            System.out.print("Enter x-coordinate (col) of point to erase: ");
            int c = key.nextInt();
            System.out.println();
            erase.eraseObject(r,c);
            System.out.println("Image after erasure\n");
            erase.print();
            System.out.print("Do you want to erase again? (y/n): ");
            String ans = key.next();
            System.out.println();
            if (ans.equals("n"))
                break;
            else if (ans.equals("y"))
                continue;
        }
    }


    /**
     * Prints out the table
     * @param fileName the file you want to load
     */
    public void loadFile(String fileName) {
        picture = new char[21][21];
        for (int r = 0; r < picture.length; r++)
            for (int c = 0; c < picture[0].length; c++)
                picture[r][c] = '-';
        try {
            Scanner in = new Scanner(new File(fileName));
            in.nextInt();
            while (in.hasNext()) {
                int r = in.nextInt();
                int c = in.nextInt();
                picture[r][c] = '@';
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints out the table
     */
    public void print() {
        System.out.print("   ");
        for (int i = 1; i < picture[0].length; i++) {
            System.out.print(i % 10);
        }
        System.out.println();
        for (int row = 1; row <= 20; row++) {
            if (row < 10)
                System.out.print(" " + row + " ");
            else
                System.out.print(row + " ");
            for (int col = 1; col <= 20; col++)
                System.out.print("" + picture[row][col]);
            System.out.println();
        }
        System.out.println();
    }

    /**
     * erase a object in the table
     * @param row the row of the object erase
     * @param col the coloum of the object erase
     */
    public void eraseObject(int row, int col) {
        if (picture[row][col] == '@' && !(row == 20 || row == 0)) {
            picture[row][col] = '-';
            eraseObject(row - 1, col);
            eraseObject(row, col + 1);
            eraseObject(row + 1, col);
            eraseObject(row, col - 1);
        }
    }
}