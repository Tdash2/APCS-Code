public class Main {
        public static void main(String[] args) {
            GraphicPolygon square = new GraphicPolygon(4, 150);
            square.draw();
            square.moveTo(200, 200);
            square.draw();

            GraphicPolygon octagon = new GraphicPolygon(8, 100);
            octagon.draw();
            octagon.moveTo(200, 200);
            octagon.draw();

            GraphicPolygon enneadecagon = new GraphicPolygon(19, 50);
            enneadecagon.draw();
            enneadecagon.moveTo(200, 200);
            enneadecagon.draw();

            GraphicPolygon enneacontakaihenagon = new GraphicPolygon(91, 10);
            enneacontakaihenagon.draw();
            enneacontakaihenagon.moveTo(200, 200);
            enneacontakaihenagon.draw();

    }
}