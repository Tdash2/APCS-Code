public class Main {
    public static void main(String[] args) {
        Coins(19  );
    }
    public static void Coins(int cents) {
        System.out.println(cents + " cents =>");

        int quarter  = cents / 25;
        System.out.println("Quarter(s) " +quarter);

        int dimes = (cents % 25) / 10;
        System.out.println("Dime(s) " +dimes);

        int nickels = ((cents % 25) % 10) / 5;
        System.out.println("Nickel(s) " +nickels);

        int pennies = (cents % 10) % 5;
        System.out.println("Penny(s) " +pennies);
    }
}