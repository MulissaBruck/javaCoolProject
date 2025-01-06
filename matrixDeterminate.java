
// Java Program to find the determinant of a 3x3 matrix
public class matrixDeterminate {

    // Method to calculate the determinant of a 3x3 matrix
    public static int calculateDeterminant(int[][] matrix) {
        // Initialize the determinant value to 0
        int determinant = 0;

        // Loop through each column in the first row (row 0)
        for (int col = 0; col < 3; col++) {
            // Get the minor matrix by excluding row 0 and the current column
            int[][] minor = getMinor(matrix, 0, col);

            // Alternate the sign for cofactors (+, -, +, ...)
            int sign = (col % 2 == 0) ? 1 : -1;

            // Add the cofactor contribution to the determinant
            // matrix[0][col] is the element of the current column
            // calculateDeterminant(minor) calculates the determinant of the minor matrix
            determinant += sign * matrix[0][col] * calculateDeterminant2x2(minor);
        }

        // Return the computed determinant
        return determinant;
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static int calculateDeterminant2x2(int[][] matrix) {
        // Formula for determinant of a 2x2 matrix:
        // det(A) = (a*d) - (b*c)
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to generate the minor matrix by excluding a specific row and column
    public static int[][] getMinor(int[][] matrix, int excludeRow, int excludeCol) {
        // Minor matrix will have a size of 2x2 since we exclude one row and one column
        int[][] minor = new int[2][2];

        // Variables to track the current row and column of the minor matrix
        int minorRow = 0;

        // Loop through each row of the original matrix
        for (int row = 0; row < 3; row++) {
            // Skip the row that needs to be excluded
            if (row == excludeRow)
                continue;

            // Reset minorCol for each new minorRow
            int minorCol = 0;

            // Loop through each column of the original matrix
            for (int col = 0; col < 3; col++) {
                // Skip the column that needs to be excluded
                if (col == excludeCol)
                    continue;

                // Assign the element from the original matrix to the minor matrix
                minor[minorRow][minorCol] = matrix[row][col];

                // Move to the next column in the minor matrix
                minorCol++;
            }

            // Move to the next row in the minor matrix
            minorRow++;
        }

        // Return the generated minor matrix
        return minor;
    }

    // Main method to test the determinant calculation
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
                { 1, 3, -2 },
                { -1, 2, 1 },
                { 1, 0, -2 }
        };

        // Calculate the determinant of the matrix
        int determinant = calculateDeterminant(matrix);

        // Print the determinant
        System.out.println("Determinant of the matrix: " + determinant);
    }
}
