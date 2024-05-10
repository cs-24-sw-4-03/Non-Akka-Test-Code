public class Factorial {

    public static void main(String[] args) {
        long n = 20;

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
