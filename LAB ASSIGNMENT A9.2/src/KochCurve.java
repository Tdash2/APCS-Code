import gpdraw.DrawingTool;
import gpdraw.SketchPad;
public class KochCurve {
     static SketchPad paper = new SketchPad(1920, 1000);
     static DrawingTool pen = new DrawingTool(paper);
    /**
     * Sets up to draw a Koch with the prams below
     * @param levels How many levels deep it should be
     * @param length How long it should be
     */
    KochCurve(int levels, int length ){
        pen.turn(90);
        dKochCurve(levels,length);
    }
    /**
     * Draws a Koch with the prams below
     * @param levels How many levels deep it should be
     * @param length How long it should be
     */
   private void dKochCurve(int levels, int length ){
        if (levels == 1){
            pen.move(length);
        }
        else{
             dKochCurve(levels - 1, length / 3);
             pen.turn(-60);
             dKochCurve(levels - 1, length / 3);
             pen.turn(120);
             dKochCurve(levels - 1, length / 3);
             pen.turn(-60);
             dKochCurve(levels - 1, length / 3);
        }
    }
}
