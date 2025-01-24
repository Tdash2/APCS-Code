public class Main {

        public static void main(String[] args)
        {
            int[] arr = { 10, 7, 8, 9, 1, 5 };

            Quicksort test = new Quicksort(arr);

            System.out.println("Sorted array: ");
            int n = arr.length;
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
                System.out.println();
        }
}