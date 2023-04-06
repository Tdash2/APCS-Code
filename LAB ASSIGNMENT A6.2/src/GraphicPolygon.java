import gpdraw.DrawingTool;
import gpdraw.SketchPad;

import java.lang.Math;

/**
 * A class that represents a regular polygon and can draw it on a SketchPad window.
 * The polygon can be moved to a different position on the window.
 */
class GraphicPolygon extends RegularPolygon{
    private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
    private double xPosition, yPosition;

    /**
     * Constructs a polygon with the specified number of sides and side length, centered at (0, 0).
     *
     * @param numSides the number of sides of the polygon
     * @param sideLength the length of each side of the polygon
     */
    public GraphicPolygon(int numSides, double sideLength){
        super(numSides, sideLength);
        xPosition = 0;
        yPosition = 0;
    }

    /**
     * Constructs a polygon with the specified number of sides and side length, centered at (x, y).
     *
     * @param numSides the number of sides of the polygon
     * @param sideLength the length of each side of the polygon
     * @param x the x-coordinate of the center of the polygon
     * @param y the y-coordinate of the center of the polygon
     */
    public GraphicPolygon(int numSides, double sideLength, double x, double y){
        super(numSides, sideLength);
        xPosition = x;
        yPosition = y;
    }

    /**
     * Moves the center of the polygon to the specified position (x, y).
     *
     * @param x the new x-coordinate of the center of the polygon
     * @param y the new y-coordinate of the center of the polygon
     */
    public void moveTo(double x, double y){
        xPosition = x;
        yPosition = y;
    }

    /**
     * Draws the polygon about the center point (xPosition, yPosition).
     * Uses properties inherited from RegularPolygon to determine the
     * number and length of the sides, the radius of the inscribed circle,
     * and the vertex angle with which to draw the polygon.
     */
    public void draw(){
        pen.up();
        double angle = 180.0 - vertexAngle();
        pen.move(xPosition + getRadius(), yPosition);
        pen.setDirection(angle);
        pen.down();
        for (int i = 0; i < getNumSides(); i++){
            pen.forward(getSideLength());
            pen.turn(180.0 - angle);
        }
    }
}