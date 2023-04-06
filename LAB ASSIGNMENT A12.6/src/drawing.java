import gpdraw.DrawingTool;
import gpdraw.SketchPad;
public class drawing {
    private static SketchPad paper = new SketchPad(440, 500);
    private static DrawingTool pen = new DrawingTool(paper);

    /**
     * Draw the ParallelLines
     */
    public drawing(){
        pen.up();
        pen.move(170);
        pen.turnRight();
        pen.move(200);
        pen.down();
        pen.turnLeft();
        drawRow(410);
        drawRow(410);
        drawRow(410);
        drawRow(430);
        drawRow(430);
        drawRow(410);
        drawRow(410);
        drawRow(430);
    }

    /**
     * Draws a row of squares
     * @param move The off set of each row
     */
    void drawRow(int move){
        pen.up();
        pen.turn(-180);
        pen.move(30);
        pen.turn(-90);
        pen.move(move);
        pen.turnRight();
        pen.down();
        drawCol();
    }

    /**
     * Draws the square and connects them
     */
    void drawCol(){
        for (int row = 0; row < 7; row++){
            drawSquare();
            System.out.println(pen.getPosition());
        }
    }
    void drawSquare(){
        pen.move(14);
        pen.turnRight();
        pen.move(15);
        pen.fillRect(30,30);
        pen.turn(-90);
        pen.move(14);
        pen.turn(90);
        pen.move(45);
        pen.turnLeft();

    }
}