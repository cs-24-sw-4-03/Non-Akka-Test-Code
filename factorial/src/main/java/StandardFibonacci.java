public class StandardFibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    private static long fibonacci(long n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
