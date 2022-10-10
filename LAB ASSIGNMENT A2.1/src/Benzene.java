import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class Benzene {
    private static SketchPad paper = new SketchPad(500, 500);
    private static DrawingTool pen = new DrawingTool(paper);
    public Benzene(){
        pen.drawCircle(100);
        pen.up();
        pen.move(150);
        pen.down();
        pen.turn(120);
        pen.move(150);
        pen.turn(60);
        pen.move(150);
        pen.turn(60);
        pen.move(150);
        pen.turn(60);
        pen.move(150);
        pen.turn(60);
        pen.move(150);
        pen.turn(60);
        pen.move(150);
    }
}
