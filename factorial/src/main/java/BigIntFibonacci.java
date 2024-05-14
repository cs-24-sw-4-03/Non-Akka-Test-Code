import java.math.BigInteger;

public class BigIntFibonacci {

    static BigInteger[] numberArray;
    public static void main(String[] args) {
        numberArray = new BigInteger[101];
        numberArray[0] = BigInteger.valueOf(0L);
        numberArray[1] = BigInteger.valueOf(1L);
        long startTime = System.nanoTime();
        BigInteger result = fibonacci(50);
        long endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time: " + (endTime - startTime) + "ns");
    }

    private static BigInteger fibonacci(int n) {
        if (n == 0){
            return BigInteger.valueOf(n);
        }else if (numberArray[n] == null || numberArray[n].compareTo(BigInteger.valueOf(n)) != 0){
            numberArray[n] = fibonacci(n-1).add(fibonacci(n-2));
            return numberArray[n];
        }else{
            return numberArray[n];
        }
    }
}
