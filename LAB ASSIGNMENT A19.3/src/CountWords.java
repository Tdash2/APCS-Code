import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

class CountWords {
    File file;
    ArrayList<Word> list = new ArrayList<Word>();
    Hashtable<String, Integer> table = new Hashtable<String, Integer>();

    /**
     * Loads the file
     * @param File The file you want to load
     */
    CountWords (String File){
        file = new File(File);

    }

    Scanner in;
    int total = 0, ind;
    private boolean used = false;

    /**
     * Counts and then prints out the top 30 most used words, the total number of unique words and the total number of words in the file
     */
    public void countAndPrint() {
        try {
            in = new Scanner(file);
            while (in.hasNext()) {
                String val = strip(in.next());
                if (!val.equals("")) {
                    Word x = new Word();
                    x.setVal(val);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(x)) {
                            used = true;
                            ind = i;
                            break;
                        }
                    }
                    if (!used) {
                        list.add(x);
                    } else {
                        list.get(ind).incFreq();
                    }
                    used = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sort();

        for (Word aList : list) {
            total += aList.getFreq();
        }

        for (int i = 1; i <= 30; i++) {
            System.out.printf("%2s %4s \n", i + " ", list.get(i - 1).toString());
        }

        System.out.println();
        System.out.println("Total number of unique words used in the file: " + list.size());
        System.out.println("Total number of words in a file: " + total);
    }

    /**
     * Strips each words of thing that are not a-z
     * @param inputString This word you want striped
     * @return The striped word
     */
    String strip(String inputString) {

        String output = "";
        inputString = inputString.toLowerCase();

        if (inputString.length() < 1) {
            return "";
        } else if (inputString.equals("-")) {
            return "";
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetterOrDigit(inputString.charAt(i)) || inputString.charAt(i) == 39 || inputString.charAt(i) == 45) {
                output = output + inputString.charAt(i);
            }
        }
        return output;
    }

    /**
     * Sort the lists
     */
    public void sort() {
        mergeValSort(list, 0, list.size() - 1);
        mergeSort(list, 0, list.size() - 1);
    }

    private void merge(ArrayList<Word> a, int first, int mid, int last) {
        ArrayList<Word> temp = new ArrayList<Word>();
        int leftIndex = first;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= last) {
            if (a.get(leftIndex).compareTo(a.get(rightIndex)) > 0) {
                temp.add(a.get(leftIndex));
                leftIndex++;
            } else {
                temp.add(a.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex <= mid) {
            temp.add(a.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= last) {
            temp.add(a.get(rightIndex));
            rightIndex++;
        }
        int i = 0;
        int j = first;
        while (i < temp.size()) {
            a.set(j, temp.get(i++));
            j++;
        }
    }

    private void mergeVal(ArrayList<Word> a, int first, int mid, int last) {
        ArrayList<Word> temp = new ArrayList<Word>();
        int leftIndex = first;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= last) {
            if (a.get(leftIndex).compareValTo(a.get(rightIndex)) > 0) {
                temp.add(a.get(leftIndex));
                leftIndex++;
            } else {
                temp.add(a.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex <= mid) {
            temp.add(a.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= last) {
            temp.add(a.get(rightIndex));
            rightIndex++;
        }
        int i = 0;
        int j = first;
        while (i < temp.size()) {
            a.set(j, temp.get(i++));
            j++;
        }
    }
    /**
     * Uses the merge sort to sort a ArrayList
     * @param a The array list you want sorted
     * @param first Where you want to start sorting
     * @param last Where you want to stop sorting
     */
    public void mergeSort(ArrayList<Word> a, int first, int last) {
        if (first < last && (last - first) >= 1) {
            int mid = (last + first) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid, last);
        }
    }

    /**
     * Uses the merge sort to sort a ArrayList
     * @param a The array list you want sorted
     * @param first Where you want to start sorting
     * @param last Where you want to stop sorting
     */
    public void mergeValSort(ArrayList<Word> a, int first, int last) {
        System.out.println(first);
        if (first < last && (last - first) >= 1) {
            int mid = (last + first) / 2;
            mergeValSort(a, first, mid);
            mergeValSort(a, mid + 1, last);
            mergeVal(a, first, mid, last);
        }
    }
}