public class Triangular {
    /**
     * Finds and prints out the square triangulars.
     * @param Numbers How many square triangulars you want to find
     */
    Triangular(int Numbers){
        int count=1;
        while(count<Numbers) {
            double s,k=count;
            s=(1.0/32.0)*(Math.pow((17+12*Math.sqrt(2)),k)+Math.pow((17-12*Math.sqrt(2)),k)-2);
            System.out.println("The "+ count + " Square Triangular Number = "+ (int)s);
            count ++;
        }
    }
}
