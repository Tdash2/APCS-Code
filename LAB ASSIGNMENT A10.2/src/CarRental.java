import java.util.Scanner;

public class CarRental {
    public static String model;
    public static int letternum;
    public static String plate;
    public static String letter;
    public static int total;
    public static int original;
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void CarRental() {
        Scanner in = new Scanner(System.in);
        System.out.print("Car Make: ");
        model = in.next();
        System.out.println("");
        System.out.print("Car Model: ");
        model = in.next();
        System.out.println("");
        System.out.print("License Plate: ");
        plate = in.next();
        original = in.nextInt();
        char one = plate.charAt(0);
        char two = plate.charAt(1);
        char three = plate.charAt(2);
        total = (one + two + three) + original;
        letternum = total % 26;
        char letter = alphabet.charAt(letternum);
        System.out.println("" + letter + total);
    }
}