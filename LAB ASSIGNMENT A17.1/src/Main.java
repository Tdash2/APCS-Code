import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        QuadSort test = new QuadSort();
        ArrayList<Comparable> list = test.initializeList();
        ArrayList <Comparable> copy = test.duplicate(list);

        System.out.println("Before Bubble Sort:");
        System.out.println(list);

        test.bubbleSort(list);	// runs your Bubble Sort code
        Collections.sort(copy);	// runs built-in sorting code
        Collections.reverse(copy);

        System.out.println("After Bubble Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");

        list = test.initializeList();
        copy = test.duplicate(list);
        System.out.println("\nBefore Selection Sort:");
        System.out.println(list);

        test.selectionSort(list);	// runs your Selection Sort code
        Collections.sort(copy);		// runs built-in sorting code

        System.out.println("After Selection Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");

        list = test.initializeList();
        copy = test.duplicate(list);
        System.out.println("\nBefore Insertion Sort:");
        System.out.println(list);

        test.insertionSort(list);	// runs your Insertion Sort code
        Collections.sort(copy);		// runs built-in sorting code
        Collections.reverse(copy);

        System.out.println("After Insertion Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");
    }
}