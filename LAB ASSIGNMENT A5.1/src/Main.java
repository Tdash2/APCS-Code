public class Main {
    public static void main(String[] args) {

        PiggyBank tj = new  PiggyBank() ;
        System.out.println(tj.getDimes());
        System.out.println(tj.getPennies());
        System.out.println(tj.getNickels());
        System.out.println(tj.getQuarters());
        System.out.println(tj.getBalance());

        tj.addFunds(5,5,5,5);
        System.out.println(tj.getDimes());
        System.out.println(tj.getPennies());
        System.out.println(tj.getNickels());
        System.out.println(tj.getQuarters());
        System.out.println(tj.getBalance());




    }
}