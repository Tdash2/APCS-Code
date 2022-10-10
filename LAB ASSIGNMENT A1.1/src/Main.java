// LAB ASSIGNMENT A1.1
// By Tj Doescher
import gpdraw.*;
public class Main {
    public static void main(String[] args) {
        DrawingTool myPencil;
        SketchPad myPaper;

        myPaper = new SketchPad(500, 500);
        myPencil = new DrawingTool(myPaper);

         //Start Drawing
        myPencil.up();
        myPencil.forward( 50);
        myPencil.down();
        myPencil.turnLeft( );
        myPencil.forward( 100);
        myPencil.turnLeft( );
        myPencil.forward( 200);
        myPencil.turnLeft( );
        myPencil.forward( 200);
        myPencil.turnLeft( );
        myPencil.forward( 200);
        myPencil.turnLeft( );
        myPencil.forward( 100);
        myPencil.up();
        myPencil.turnRight();
        myPencil.forward(100);
        myPencil.turnLeft();
        myPencil.turn(45);
        myPencil.down();
        myPencil.forward( 142);
        myPencil.turn(-45);
        myPencil.up();
        myPencil.turnLeft();
        myPencil.turnLeft();
        myPencil.forward(200);
        myPencil.down();
        myPencil.turnRight();
        myPencil.turnRight();
        myPencil.turnRight();
        myPencil.turn(45);
        myPencil.forward( 142);
        myPencil.turn(-45);
        myPencil.up();
        myPencil.move(-300);
        myPencil.down();
        myPencil.turnRight();
        myPencil.move(20);
        myPencil.turnLeft();
        myPencil.move(80);
        myPencil.turnLeft();
        myPencil.move(40);
        myPencil.turnLeft();
        myPencil.move(80);
        myPencil.turn(180);
        myPencil.up();
        myPencil.move(100);
        myPencil.down();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.up();
        myPencil.up();
        myPencil.turnRight();
        myPencil.move(40);
        myPencil.down();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
        myPencil.move(50);
        myPencil.turnLeft();
    }
}