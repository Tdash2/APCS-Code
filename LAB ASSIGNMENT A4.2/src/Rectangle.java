import gpdraw.DrawingTool;
import gpdraw.SketchPad;
public class Rectangle {
    private double myX;// the x coordinate of the rectangle
    private double myY; // the y coordinate of the rectangle
    private double myWidth; // the width of the rectangle
    private double myHeight; // the height of the rectangle
    private static SketchPad paper = new SketchPad(500, 500);
    private static DrawingTool pen = new DrawingTool(paper);

    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myHeight = 0;
        myWidth =0;

    }
    public double getArea(){
        return myWidth * myHeight;
    }
    public Rectangle (double x, double y, double width, double height){
        myX = x;
        myY = y;
        myHeight = height;
        myWidth = width;

        pen.turnRight();
        pen.move(myX);
        pen.turnRight();
        pen.move(myY);
        pen.down();
        pen.move(width);
        pen.turnRight();
        pen.move(myHeight);
        pen.turnRight();
        pen.move(width);
        pen.turnRight();
        pen.move(myHeight);
        pen.turnRight();
        pen.up();
    }
}
