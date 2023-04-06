import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stats {
    int array[] = {};
    public Stats(String File) {
        try (Scanner s = new Scanner(new FileReader(File))) {
            while (s.hasNext()) {
                array = addX(array, s.nextInt());
            }
        } catch (IOException ex) {
            System.out.println("Error reading from file:");
            ex.printStackTrace();
        }
    }
    /**
     * Add to an array
     * @param myArray the array you want to add to
     * @param x What you want to add the array
     * @return the appended array
     */
    public static int[] addX(int myArray[], int x) {
        int i;
        int newArray[] = new int[myArray.length + 1];
        for (i = 0; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }

        newArray[myArray.length] = x;
        return newArray;
    }

    /**
     * Gets the Average of the txt file that was inputted into the constructor
     * @return Average of the txt file that was inputted into the constructor
     */
    public double getAverage(){

        int total = 0;
        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }
        Double out = (double) total / (double) array.length;
       return Math.round(out*100)/100D;
    }
    /**
     * Gets the standard Deviation of the txt file that was inputted into the constructor
     * @return standard Deviation of the txt file that was inputted into the constructor
     */
    public double standardDeviation() {

        double length = array.length;
        double mean = getAverage();
        double standardDeviation = 0;
        for (double num : array) {

            standardDeviation += Math.pow(num - mean, 2);


        }
        double out = Math.sqrt(standardDeviation /  length);
        return Math.round(out*100)/100D;

    }
    /**
     * Gets the Mode of the txt file that was inputted into the constructor
     * @return Mode Deviation of the txt file that was inputted into the constructor
     */
    public long getMode() {

        int maxKey = 0;
        int maxCounts = 0;

        int[] counts = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            counts[array[i]]++;
            if (maxCounts < counts[array[i]]) {
                maxCounts = counts[array[i]];
                maxKey = array[i];
            }
        }
        return maxKey;
    }
}
