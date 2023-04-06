import gpdraw.DrawingTool;
import gpdraw.SketchPad;

class GraphicPolygon extends RegularPolygon{
    private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
    private double xPosition, yPosition;

    /**
     * Makes a polygon that is centered the polygon is centered at xPosition = 0, yPosition = 0.
     * @param numSides the number of sides of the polygon
     * @param sideLength the length of each side of the polygon
     */
    public GraphicPolygon(int numSides, double sideLength){
        super(numSides, sideLength);
        xPosition = 0;
        yPosition = 0;
    }

    /**
     * Makes a polygon is centered at xPosition = x and yPosition = y.
     * @param numSides the number of sides of the polygon
     * @param sideLength the length of each side of the polygon
     * @param x the x coordinate of the center of the polygon
     * @param y the y coordinate of the center of the polygon
     */
    public GraphicPolygon(int numSides, double sideLength, double x, double y){
        super(numSides, sideLength);
        xPosition = x;
        yPosition = y;
    }

    /**
     * Sets the new center of the polygon.
     * @param x the new x coordinate of the center of the polygon
     * @param y the new y coordinate of the center of the polygon
     */
    public void moveTo(double x, double y){
        xPosition = x;
        yPosition = y;
    }

    /**
     * Draws the polygon at the center point.
     */
    public void draw(){
        double angle = 360.0 / getNumSides();
        double radius = getSideLength() / (2 * Math.sin(Math.toRadians(angle / 2)));

        pen.up();
        pen.move(xPosition + radius, yPosition);
        pen.down();
        pen.setDirection(90 - angle / 2);

        for (int i = 0; i < getNumSides(); i++) {
            pen.move(getSideLength());
            pen.turn(180 - angle);
        }
    }
}
