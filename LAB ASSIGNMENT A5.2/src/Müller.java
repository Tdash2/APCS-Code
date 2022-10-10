import gpdraw.DrawingTool;
import gpdraw.SketchPad;
public class Müller {
    private static SketchPad paper = new SketchPad(500, 500);
    private static DrawingTool pen = new DrawingTool(paper);

    public Müller(){
        pen.turnRight();
        pen.move(50);
        pen.turn(135);
        pen.move(15);
        pen.up();
        pen.turn(180);
        pen.move(15);
        pen.turn(-90);
        pen.down();
        pen.move(15);
        pen.up();
        pen.turn(180);
        pen.move( 15);
        pen.turn(-45);
        pen.turn(180);
        pen.move(50);
        pen.down();
        pen.turn(135);
        pen.move(15);
        pen.turn(180);
        pen.move(15);
        pen.turn(-90);
        pen.move(15);
        pen.turn(180);
        pen.move(15);
        pen.turn(45);
        pen.up();
        pen.move(50);
        pen.down();
        pen.turn(90);
        pen.move(50);
        pen.turn(45);
        pen.move (15);
        pen.turn(180);
        pen.move(15);
        pen.turn(90);
        pen.move(15);
        pen.turn(180);
        pen.move(15);
        pen.turn(-135);
        pen.turn(180);
        pen.move (50);
        pen.turn(45);
        pen.move(15);
        pen.turn(180);
        pen.move(15);
        pen.turn(45);
        pen.turn(45);
        pen.move(15);

    }


}
