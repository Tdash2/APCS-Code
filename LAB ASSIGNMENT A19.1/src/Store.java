import java.io.File;
import java.util.*;

class Store {
    private ArrayList<Item> myStore = new ArrayList<Item>();

    /**
     * Creates a Store from data in the file
     * @param fName The data file
     */
    public Store(String fName) {
        loadFile(fName);
    }

    public void testSearch(){
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            //index = bsearch(new Item(idToFind, 0));
            //recursive version call
            index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println(" No such part in stock");
            }else{
                System.out.println(" Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }

    /**
     * Searches the  ArrayList for the Item specified
     * @param idToSearch Item object containing id value being searched for
     * @return index of Item if found, -1 if not found
     */
    private int bsearch(Item idToSearch){
        int val = idToSearch.getId();
        int f = 0;
        int l = myStore.size() - 1;
        int mid = (f + l) / 2;

        while (true) {
            if (mid == 0) {
                return -1;
            } else if (myStore.get(mid).getId() < val) {
                f = mid + 1;
                mid = (f + l) / 2;
            } else if (myStore.get(mid).getId() > val) {
                l = mid;
                mid = (f + l) / 2;
            } else if (myStore.get(mid).getId() == val) {
                return mid;
            }
        }
    }

    /**
     * Searches the specified ArrayList of Item Objects for the given id
     * @param idToSearch Id value being search for
     * @param first Starting index of search range
     * @param last Ending index of search range
     * @return index of Item if found, -1 if not found
     */
    private int bsearch(Item idToSearch, int first, int last){
        int val = idToSearch.getId();
        int mid = (first + last) / 2;

        if (first > last) {
            return -1;
        } else if (myStore.get(mid).getId() == val) {
            return mid;
        } else if (myStore.get(mid).getId() < val) {
            return bsearch(idToSearch, mid + 1, last);
        } else {
            return bsearch(idToSearch, first, mid - 1);
        }
    }

    /**
     * Reads a file containing the data pairs one pair per line.
     * @param inFileName name of file
     */
    private void loadFile(String inFileName) {
        try {
            File inFile = new File(inFileName);
            Scanner in = new Scanner(inFile);

            while (in.hasNext()) {
                Item item = new Item(in.nextInt(), in.nextInt());
                myStore.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints the store contents
     */
    public void displayStore() {
        System.out.printf("%1s  %3s %9s", "Line #", "ID", "Inv");
        System.out.println();
        for(int i = 0; i < myStore.size(); i++) {
            System.out.printf("%1d  %9d  %6d", i + 1, myStore.get(i).getId(), myStore.get(i).getInv());
            System.out.println();
        }
    }

    /**
     * Sorts the store ArrayList using recursive mergesort
     */
    public void sort() {
        mergeSort(myStore, 0, myStore.size() - 1);
    }

    private void merge(ArrayList<Item> a, int first, int mid, int last) {
        ArrayList<Item> temp = new ArrayList<Item>();
        int leftIndex = first;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= last) {
            if (a.get(leftIndex).compareTo(a.get(rightIndex)) < 0) {
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
     * Sorts an array List of Items with the merge methiod
     * @param a     ArrayList you want sorted
     * @param first starting range of values that you want to be  sorted
     * @param last  ending range of values that you want to be sorted
     */
    public void mergeSort(ArrayList<Item> a, int first, int last) {
        if (first < last && (last - first) >= 1) {
            int mid = (last + first) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid, last);
        }
    }
}		