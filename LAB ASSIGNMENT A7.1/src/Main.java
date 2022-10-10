import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double toal = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter item #1: ");
        double item1 = in.nextDouble();
        System.out.print("Enter item #2: ");
        double item2 = in.nextDouble();
        System.out.print("Enter item #3: ");
        double item3 = in.nextDouble();
        System.out.print("Enter item #4: ");
        double item4 = in.nextDouble();
        System.out.print("Enter item #5: ");
        double item5 = in.nextDouble();
        System.out.println();
        System.out.printf("%s", "Item:");
        System.out.printf("%11s", "Price:");
        System.out.printf("%12s", "Total:\n");

        System.out.printf("%5s", "#1");
        System.out.printf("%11.2f", item1);
        toal =toal+ item1;
        System.out.printf("%11.2f", toal);
        System.out.println();

        System.out.printf("%5s", "#2");
        System.out.printf("%11.2f", item2);
        toal =toal+ item2;
        System.out.printf("%11.2f", toal);
        System.out.println();

        System.out.printf("%5s", "#3");
        System.out.printf("%11.2f", item3);
        toal =toal+ item3;
        System.out.printf("%11.2f", toal);
        System.out.println();

        System.out.printf("%5s", "#4");
        System.out.printf("%11.2f", item4);
        toal =toal+ item4;
        System.out.printf("%11.2f", toal);
        System.out.println();

        System.out.printf("%5s", "#5");
        System.out.printf("%11.2f", item5);
        toal = toal + item5;
        System.out.printf("%11.2f", toal);
    }
}