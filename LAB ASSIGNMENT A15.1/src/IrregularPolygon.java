import java.awt.geom.*;
import java.util.ArrayList;
import gpdraw.DrawingTool;
import gpdraw.SketchPad;


public class IrregularPolygon{
    private ArrayList <Point2D.Double> Polygon;
    private DrawingTool pen;
    private SketchPad paper;

    /**
     * Create the array Polygon and the drawing space
     */
    public IrregularPolygon() {
        Polygon = new ArrayList<Point2D.Double>();
        paper = new SketchPad(500, 500);
        pen = new DrawingTool(paper);
    }

    /**
     * Adds a point to the Polygon
     * @param Point The point you want to add to the Polygon from Point2D.Double
     */
    public void add(Point2D.Double Point) {
        Polygon.add(Point);
    }

    /**
     * Draws the Polygon base off of the points given.
     */
    public void draw() {
        pen.up();
        pen.move(Polygon.get(0).getX(), Polygon.get(0).getY());
        pen.down();
        for(int i = 1; i < Polygon.size(); i++) {
            pen.move(Polygon.get(i).getX(), Polygon.get(i).getY());
        }
        pen.move(Polygon.get(0).getX(), Polygon.get(0).getY());
    }

    /**
     * Finds the perimeter of the shape based off of what was give
     * @return The perimeter of the shape
     */
    public double perimeter() {
        double perimeter = 0;
        for(int i = 0; i < Polygon.size() - 1; i++) {
            perimeter += Polygon.get(i).distance(Polygon.get(i+1));
        }
        perimeter += Polygon.get(Polygon.size() - 1).distance(Polygon.get(0));
        return perimeter;
    }
    /**
     * Finds the area of the shape based off of what was give
     * @return The area of the shape
     */
    public double area() {
        double area = 0;
        for(int i = 0; i < Polygon.size() - 1; i++) {
            area += (Polygon.get(i).getX() * Polygon.get(i+1).getY()) - (Polygon.get(i+1).getX() * Polygon.get(i).getY());
        }
        area += (Polygon.get(Polygon.size() - 1).getX() * Polygon.get(0).getY()) - (Polygon.get(0).getX() * Polygon.get(Polygon.size() - 1).getY());
        return Math.abs(area / 2);
    }
}