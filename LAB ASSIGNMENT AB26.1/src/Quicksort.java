public class Quicksort {

    public Quicksort(int[] arr){
        int n = arr.length;

        quickSort(arr, 0, n - 1);
    }

    /**
     * Swaps elements in an array
     * @param arr the array you want to Swap elements in an array
     * @param in What you want to substute in
     * @param replace the value you want to replace.
     */
         void swap(int[] arr, int in, int replace)
        {
            int temp = arr[in];
            arr[in] = arr[replace];
            arr[replace] = temp;

        }
         int partition(int[] arr, int low, int high)
        {
            int pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            System.out.println("high " +low);
            System.out.println("low " +high);
            System.out.println("return " +i+1);
            return (i + 1);

        }
    /**
     * Sorts an array with quick sort
     * @param arr The array you want to sort with quick sort
     * @param low Where we are going to start to sort the array
     * @param high Where you want to stop sorting the array
     */
         void quickSort(int[] arr, int low, int high)
        {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
    }

