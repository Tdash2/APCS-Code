import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PermutationGenerator test = new PermutationGenerator();

        for (int i = 1; i <= 4628800; i++) {
            System.out.println("List " + i + " " + test.nextPermutation());
        }
    }
}