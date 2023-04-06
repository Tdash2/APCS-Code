import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        IrregularPolygon parallelogram = new IrregularPolygon();
        parallelogram.add(new Point2D.Double(20, 10));
        parallelogram.add(new Point2D.Double(70, 20));
        parallelogram.add(new Point2D.Double(50, 50));
        parallelogram.add(new Point2D.Double(0, 40));
        parallelogram.draw();
    }
}

