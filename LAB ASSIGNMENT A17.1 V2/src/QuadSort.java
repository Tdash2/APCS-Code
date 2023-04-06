import java.util.ArrayList;
import java.util.Iterator;

public class QuadSort {
    /**
     * Sorts an ArrayList by using the Bubble Sort algorithm
     * @param list the ArrayList that you want to sort using the Bubble Sort algorithm
     */
    void bubbleSort(ArrayList<Comparable> list) {
        for(int i = 0; i <= list.size() - 1; i++) {
            for(int j = list.size() - 1; j > i; j--) {
                if(list.get(j).compareTo(list.get(j - 1)) > -1) {
                    Comparable temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }

    /**
     * Sorts an ArrayList by using the Selection Sort algorithm
     * @param list the ArrayList that you want to sort using the Selection Sort algorithm
     */
    void selectionSort(ArrayList <Comparable> list) {
        int min;
        Comparable temp;

        for (int i = 0; i < list.size()-1; i++) {
            min = i;

            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(min)) < 0) {
                    min = j;
                }
            }
            temp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, temp);
        }
    }
    /**
     * Sorts an ArrayList by using the Insertion Sort algorithm
     * @param list the ArrayList that you want to sort using the Insertion Sort algorithm
     */
    void insertionSort(ArrayList <Comparable> list) {
        for (int i = 1; i < list.size(); i++){
            int pos = i;
            Comparable key = list.get(pos);

            while (pos > 0 && key.compareTo(list.get(pos-1)) > 0){
                list.set(pos, list.get(pos - 1));
                pos--;
            }
            list.set(pos, key);
        }
    }

    ArrayList <Comparable> initializeList() {

        String[] words = {"apple", "orange", "banana", "pear", "peach", "plum",
                "grape", "cherry", "apricot", "strawberry"};

        ArrayList <Comparable> temp = new ArrayList<Comparable>();
        ArrayList <Comparable> list = new ArrayList<Comparable>();

        for (int i = 0; i < words.length; i++)
            temp.add(words[i]);
        list.clear();
        while (temp.size() > 0) {
            list.add(temp.remove((int)(Math.random()*temp.size())));
        }
        return list;
    }

    ArrayList <Comparable> duplicate(ArrayList<Comparable> list) {
        ArrayList<Comparable> listCopy = new ArrayList<Comparable>();
        Iterator<Comparable> iter = list.iterator();
        while(iter.hasNext()){
            listCopy.add(iter.next());
        }
        return listCopy;
    }
}

