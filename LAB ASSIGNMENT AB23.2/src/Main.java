import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        int total = 0;
        int avg;
        for(int i = 0; i < 100; i++){
            li.add(findTrials());
            double status = (double)(i/100.00)*100.00 ;
            System.out.println("Progress " + status + "%");
        }

        for(int i = 0; i < li.size(); i++)

            total += li.get(i);
        avg = total / li.size();
        System.out.println("The Average is: " + avg);
    }

    static int findTrials(){
        KnightsTour test = new KnightsTour();
        int count = 0;
        int test2=0;
        while(!(test2 == 64)){
            test2 = test.play();
            count ++;
        }
        System.out.println(count);
        return (count);
    }
}