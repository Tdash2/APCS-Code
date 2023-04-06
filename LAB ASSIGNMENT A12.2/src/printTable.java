public class printTable {
    printTable(int row, int  col) {
        int a =1;
        int b;
        int sum;
        System.out.print("    ");
        for (b = 1; b <= col; ++b) {
            System.out.printf("%5d", ((a*b)));
        }
        System.out.print("\n \n");
        for (a = 1; a <= row; ++a) {
            System.out.printf("%-4d", (a));
            for (b = 1; b <= col; ++b) {
                System.out.printf("%5d", (a*b));
            }
            System.out.println();

        }




    }
}
