public class Fibonacci {
    Fibonacci(int n){

        System.out.println( getFib(n) );

    }

    private int getFib(int N)
    {
        // Base Case
        if (N <= 1)
            return N;

        // Recursive call
        return getFib(N - 1)
                + getFib(N - 2);
    }

}
