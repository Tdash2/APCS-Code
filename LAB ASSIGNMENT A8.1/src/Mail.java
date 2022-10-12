import java.util.Scanner;
public class Mail {
    /**
     * Asks the user for the specs of the package and checks them against the requirement.
     */
    public Mail(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item's height: ");
        double height = in.nextDouble();
        System.out.print("Enter the item's with: ");
        double with = in.nextDouble();
        System.out.print("Enter the item's length: ");
        double length = in.nextDouble();
        System.out.print("Enter the item's weight (LB): ");
        double weight = in.nextDouble();
        double temp = height>with?height:with;
        double largest=length>temp?length:temp;
        if (largest > 100){
            if (weight>70){
                System.out.println("Package is too large and too heavy");
            } else {
                System.out.println("Package is too large");
            }
        }else if (weight > 70){
            System.out.println("Package is too heavy.");
        }else {
            System.out.println("Package is acceptable");
        }


    }
}
