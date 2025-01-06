public class printSpiralMatrix {
    public static void main(String[] args) {
        int n = 6; // Size of the matrix
        int[][] matrix = new int[n][n]; // Initialize the matrix

        int value = 1; // Start filling the matrix from 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // Fill the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Fill top row (left to right)
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Fill right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Fill bottom row (right to left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // Fill left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
