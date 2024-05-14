import java.math.BigInteger;

public class StandardFibonacci {

    //Highest Fibonacci number a long can hold is 92
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long result = fibonacci(50);
        long endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time: " + (endTime - startTime) + "ns");
    }

    private static long fibonacci(long n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
