import java.util.ArrayList;
import java.util.Random;

public class PermutationGenerator {

    private Random rand = new Random();
    public PermutationGenerator() {}

    /**
     * Generates Permutation of the numbers 1-10
     * @return
     */
    public ArrayList<Integer> nextPermutation() {
        ArrayList<Integer> unused = new ArrayList<Integer>();
        for (int num = 0; num < 10; num++) {
            unused.add(num + 1);
        }
        ArrayList<Integer> perm = new ArrayList<Integer>();
        for (int num = 0; num < 10; num++) {
            int pos = rand.nextInt(unused.size());

            perm.add(unused.remove(pos));
        }
        return perm;
    }
}
