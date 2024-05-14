import java.math.BigInteger;

public class SmartFibonacci {

    //Highest Fibonacci number a long can hold is 92
    static long[] longArray;
    public static void main(String[] args) {
        longArray = new long[101];
        longArray[0] = 0;
        longArray[1] = 1;

        long startTime = System.nanoTime();
        long result = fibonacci(92);
        long endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time: " + (endTime - startTime) + "ns");
    }

    private static long fibonacci(int n) {
        if (n == 0){
            return n;
        }else if (longArray[n] == 0){
            longArray[n] = fibonacci(n-1) + fibonacci(n-2);
            return longArray[n];
        }else{
            return longArray[n];
        }
    }
}
