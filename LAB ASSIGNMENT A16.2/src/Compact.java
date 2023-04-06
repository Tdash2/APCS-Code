public class Compact {
    /**
     * Removes the 0 from the array
     * @param input They array you want to remove the 0 from
     * @return an array with the 0 remove the aray
     */
    public static int[] compactArray(int[] input) {
        System.out.println();
        int num0 = 0;
        int length = input.length;
        for(int i = 0; i < length; ++i) {
            if(input[i] == 0) {
                num0++;
                --length;
                for(int j = i; j < length; ++j) {
                    input[j] = input[j+1];
                }
                i--;
            }
        }
        return input;
    }
}
