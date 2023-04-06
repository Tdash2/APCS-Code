import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
    ArrayList<Integer> result = new ArrayList<>();

    /**
     * Converts a text file into a ArrayList of ints
     * @param File The path to the file you want to convert to an ArrayList
     */
    public Statistics (String File){
        try (Scanner s = new Scanner(new FileReader(File))) {
            while (s.hasNext()) {
                result.add(s.nextInt());
            }
        } catch (IOException ex) {
        System.out.println("Error reading from file:");
        ex.printStackTrace();
        }
    }

    /**
     * Gets the Average of the txt file that was inputted into the constructor
     * @return Average of the txt file that was inputted into the constructor
     */
    public long getAverage(){

        return (long) result.stream().mapToInt(val -> val).average().orElse(0.0);
    }
    /**
     * Gets the standard Deviation of the txt file that was inputted into the constructor
     * @return standard Deviation of the txt file that was inputted into the constructor
     */
    public double  standardDeviation(){

        // Step 1:
        double mean = getAverage();
        double temp = 0;

        for (int i = 0; i < result.size(); i++)
        {
            int val = result.get(i);

            // Step 2:
            double squrDiffToMean = Math.pow(val - mean, 2);

            // Step 3:
            temp += squrDiffToMean;
        }

        // Step 4:
        double meanOfDiffs = (double) temp / (double) (result.size());

        // Step 5:
        return Math.sqrt(meanOfDiffs);
    }
    /**
     * Gets the Mode of the txt file that was inputted into the constructor
     * @return Mode Deviation of the txt file that was inputted into the constructor
     */
    public long getMode() {
        int mode;
        int freqMode;
        int temp;
        int tempFreq;

        mode=temp=-1;
        freqMode=tempFreq=0;
        Collections.sort(result);

        for(Integer integer:result){
            if(mode == -1){
                mode = integer;
                freqMode = 1;
            }else if(mode == integer){
                freqMode++;
            }else if(temp != integer){
                temp = integer;
                tempFreq = 1;
            }else if(tempFreq >= freqMode){
                mode = integer;
                freqMode = tempFreq+1;
                temp = -1;
                tempFreq = 0;
            }else {
                tempFreq++;
            }
        }
        return mode;
    }
}
