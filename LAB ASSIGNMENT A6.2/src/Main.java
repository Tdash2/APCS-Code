public class Main {
    public static void main(String[] args) {
        // create a square with 4 sides of length 150
        GraphicPolygon square = new GraphicPolygon(4, 150);
        square.draw();

        // move the center of the square to (200, 200) and redraw it
        square.moveTo(200, 200);
        square.draw();

        // create an octagon with 8 sides of length 100
        GraphicPolygon octagon = new GraphicPolygon(8, 100);
        octagon.draw();

        // move the center of the octagon to (100, 100) and redraw it
        octagon.moveTo(100, 100);
        octagon.draw();

        // create an enneadecagon with 19 sides of length 50
        GraphicPolygon enneadecagon = new GraphicPolygon(19, 50);
        enneadecagon.draw();

        // move the center of the enneadecagon to (300, 300) and redraw it


    }
}