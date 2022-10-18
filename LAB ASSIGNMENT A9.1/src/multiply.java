public class multiply {
    multiply(int Num1, int Num2){
        System.out.println(getMultply(Num1, Num2));
    }

    private int getMultply(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        else {
            return num1 + getMultply(num1, num2 - 1);
        }
    }
}
