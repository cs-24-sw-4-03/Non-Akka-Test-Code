import java.util.Arrays;

public class MatrixMultiplication {

    public static int heightFinalMatrix = 3;
    public static int sharedDimension = 3;
    public static int widthFinalMatrix = 3;
    public static void main(String[] args) {

        int[][] a = randomMatrix(heightFinalMatrix, sharedDimension);
        int[][] b = randomMatrix(sharedDimension, widthFinalMatrix);

        long startTime = System.nanoTime();
        int[][] c = multiply(a, b);
        long endTime = System.nanoTime();

        System.out.println(Arrays.deepToString(c));
        System.out.println("Time: " + (endTime - startTime) + "ns");

    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[heightFinalMatrix][widthFinalMatrix];

        for (int i = 0; i < heightFinalMatrix; i++) {
            for (int j = 0; j < widthFinalMatrix; j++) {
                for (int k = 0; k < sharedDimension; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static int[][] randomMatrix(int height, int width) {
        int[][] a = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        return a;
    }
}
