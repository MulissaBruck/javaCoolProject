
public class matrixTrace {

    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 4, 4 },
                { 2, 3, 7 },
                { 0, 5, 1 }
        };
        int[][] matrix2 = {
                { 8, 9, 11 },
                { 0, 1, 15 },
                { 4, 10, -7 }
        };

        calculateNormalAndTrace(matrix1);
        calculateNormalAndTrace(matrix2);
    }

    public static void calculateNormalAndTrace(int[][] matrix) {
        int trace = 0;
        double normal = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Add to the sum of squares for normal
                normal += matrix[i][j] * matrix[i][j];
                // Add diagonal elements for trace
                if (i == j) {
                    trace += matrix[i][j];
                }
            }
        }

        normal = Math.sqrt(normal);

        System.out.println("Normal = " + (int) normal);
        System.out.println("Trace = " + trace);
    }
}
