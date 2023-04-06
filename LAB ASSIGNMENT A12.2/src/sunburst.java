import gpdraw.DrawingTool;
import gpdraw.SketchPad;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class sunburst {
     private static SketchPad paper = new SketchPad(500, 500);
     private static DrawingTool pen = new DrawingTool(paper);
    public void sunburst(){
        int count=1;
        List<Color> givenList = Arrays.asList(Color.MAGENTA, Color.blue, Color.red,Color.green,Color.yellow, Color.pink);
        while (count<360) {
            Random rand = new Random();
            Color randomElement = givenList.get(rand.nextInt(givenList.size()));
            pen.setColor(randomElement);
            pen.move(100);
            pen.move(-100);
            pen.turn(1);
            count++;
        }
    }
}
