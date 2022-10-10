public class Main {
    public static void main(String[] args) {
        Car auto = new Car(15);
        System.out.println("New car odometer reading: " + auto.getEndMiles());
        auto.fillUp(150,8);
        System.out.println("Miles per gallon " + auto.calculateMPG());
        System.out.println("Miles per gallon " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(550, 20);
        System.out.println("Miles per gallon " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(703, 25.5);
        System.out.println("Miles per gallon " + auto.calculateMPG());

    }
}