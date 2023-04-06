public class Rolling {
    /**
     * A class to find when 3 dies will all have diffarante value
     */
    public Rolling() {
        boolean done = true;
        int count = 0 ;
        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        while (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
            roll1 = (int) ((Math.random() * 6) + 1);
            roll2 = (int) ((Math.random() * 6) + 1);
            roll3 = (int) ((Math.random() * 6) + 1);
            System.out.println(roll1 + " " + roll2 + " " + roll3);
            count++;
        }
        System.out.println("count = " +count);
        System.out.println();
    }
}
