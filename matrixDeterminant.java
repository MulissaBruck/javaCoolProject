
public class matrixDeterminant {

    // Function to calculate the determinant of a 3x3 matrix using cofactors
    public static int calculateDeterminant(int[][] matrix) {
        int determinant = 0;

        for (int col = 0; col < 3; col++) {
            // Calculate minor (submatrix) for each element in the first row
            int[][] minor = getMinor(matrix, 0, col);

            // Calculate cofactor and add to the determinant
            determinant += matrix[0][col] * getDeterminantOf2x2(minor) * (col % 2 == 0 ? 1 : -1);
        }

        return determinant;
    }

    // Helper function to get the minor matrix (2x2) by excluding a row and column
    private static int[][] getMinor(int[][] matrix, int excludeRow, int excludeCol) {
        int[][] minor = new int[2][2];
        int minorRow = 0, minorCol;

        for (int row = 0; row < 3; row++) {
            if (row == excludeRow)
                continue;

            minorCol = 0;
            for (int col = 0; col < 3; col++) {
                if (col == excludeCol)
                    continue;

                minor[minorRow][minorCol] = matrix[row][col];
                minorCol++;
            }
            minorRow++;
        }

        return minor;
    }

    // Function to calculate the determinant of a 2x2 matrix
    private static int getDeterminantOf2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static void main(String[] args) {
        // Define the 3x3 matrix
        int[][] matrix = {
                { 1, 3, -2 },
                { -1, 2, 1 },
                { 1, 0, -2 }
        };

        // Calculate the determinant
        int determinant = calculateDeterminant(matrix);

        // Print the result
        System.out.println("The determinant of the matrix is: " + determinant);
    }
}
