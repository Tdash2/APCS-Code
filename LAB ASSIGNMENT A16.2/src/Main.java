import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String File = "C:\\compact.txt";
        int array[] = {};
        Compact com = new Compact();

            try (Scanner s = new Scanner(new FileReader(File))) {
                while (s.hasNext()) {
                    array = addX(array, s.nextInt());
                }
                com.compactArray(array);
            } catch (IOException ex) {
                System.out.println("Error reading from file:");
                ex.printStackTrace();
            }
        }
        public static int[] addX(int myArray[], int x) {
            int i;
            int newArray[] = new int[myArray.length + 1];
            for (i = 0; i < myArray.length; i++){
                newArray[i] = myArray[i];
            }

            newArray[myArray.length] = x;
            return newArray;
        }
}