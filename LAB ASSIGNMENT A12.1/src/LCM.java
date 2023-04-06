public class LCM {
    /**
     * Finds the LCM Of 2 numbers
     * @param n1 The first number
     * @param n2 The second number
     */
    public LCM(int n1, int n2){
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                break;
            }
            ++lcm;
        }
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }
}
