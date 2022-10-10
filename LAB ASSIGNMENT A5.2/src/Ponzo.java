import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class Ponzo {
    private static SketchPad paper = new SketchPad(500, 500);
    private static DrawingTool pen = new DrawingTool(paper);

    public Ponzo(){
        pen.move(50);
        pen.up();
        pen.turn(90);
        pen.move(100);
        pen.turn(90);
        pen.down();
        pen.move(50);
        pen.up();
        pen.turn(90);
        pen.turn(180);
        pen.move(300);
        pen.down();
        drawAngledLine(-10);
        drawAngledLine(-9);
        drawAngledLine(-8);
        drawAngledLine(-7);
        drawAngledLine(-6);
        drawAngledLine(-5);
        drawAngledLine(-4);
        drawAngledLine(-3);
        drawAngledLine(-2);
        drawAngledLine(-1);
        drawAngledLine(10);
        drawAngledLine(9);
        drawAngledLine(8);
        drawAngledLine(7);
        drawAngledLine(6);
        drawAngledLine(5);
        drawAngledLine(4);
        drawAngledLine(3);
        drawAngledLine(2);
        drawAngledLine(1);
        drawAngledLine(0);

    }
    void drawAngledLine(int angle){
        pen.turn(180);
        pen.turn(angle);
        pen.move(700);
        pen.up();
        pen.turn(180);
        pen.move(700);
        pen.turn(- angle);
        pen.down();

    }
}
