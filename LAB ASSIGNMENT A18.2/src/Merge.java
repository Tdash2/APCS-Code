import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Merge {
    private Scanner in;
    /**
     *  Merge method to merge two sorted lists.
     *  Pre: Lists A and B are sorted in not decreasing order.
     *  Description: Lists A and B are merged into one list, C.
     *  post: List C contains all the values from Lists A and B, in not decreasing order.
     */
    public void merge (ArrayList<Comparable> a, ArrayList <Comparable> b, ArrayList <Comparable> c) {
        int bIndex = 0;
        int aIndex = 0;
        int cIndex = 0;

        while (bIndex < b.size() && aIndex < a.size()) {
            if ((b.get(bIndex).compareTo(a.get(aIndex))) < 0) {
                c.add(cIndex, b.get(bIndex));
                bIndex++;
            } else {
                c.add(cIndex, a.get(aIndex));
                aIndex++;
            }
            cIndex++;
        }
        if (bIndex >= b.size()) {
            for (int i=aIndex; i<a.size(); i++) {
                c.add(cIndex, a.get(i));
                cIndex++;
            }
        } else {
            for (int i=bIndex; i<b.size(); i++) {
                c.add(cIndex, b.get(i));
                cIndex++;
            }
        }
    }
    /**
	*    - Makes an array list after asking the user how many numbers to generate and what the largest integer to generate
	* @return  an ArrayList of size specified by the user filled with random numbers
	*/
    public ArrayList <Comparable> fillArray() {
        in = new Scanner(System.in);
        ArrayList<Comparable> myArray;

        System.out.print("How many numbers do you wish to generate? ");
        int numInts = in.nextInt();
        System.out.print("Largest integer to generate? ");
        int largestInt = in.nextInt();

        Random randGen = new Random();
        myArray = new ArrayList<Comparable>();

        for (int loop = 0; loop < numInts; loop++) {
            Integer x = new Integer(randGen.nextInt(largestInt) + 1);
            myArray.add(x);
        }
        return myArray;
    }

    /**
     * Prints out the ArrayList
     * @param temp The ArrayList you want to print
     */
    public void screenOutput(ArrayList <Comparable> temp) {
        for (int loop = 0; loop < temp.size(); loop++) {
            if (loop % 20 == 0) {
                System.out.println();
            }
            System.out.print(temp.get(loop) + "  ");
        }
        System.out.println();
    }

}
