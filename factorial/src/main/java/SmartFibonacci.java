public class SmartFibonacci {

    static long[] longArray;
    public static void main(String[] args) {
        longArray = new long[101];
        longArray[0] = 0;
        longArray[1] = 1;
        System.out.println(fibonacci(100));
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
