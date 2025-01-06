
import java.io.*;

class addMatrix {

    // Function to print Matrix
    static void printMatrix(int M[][], int rowSize, int colSize) {
        // Iterate through each row
        for (int i = 0; i < rowSize; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " "); // Print each element

            // After printing each row, move to the next line
            System.out.println();
        }
    }

    // Function to add the two matrices A and B and store the result in matrix C
    static int[][] add(int A[][], int B[][], int size) {
        int i, j;
        // Initialize matrix C to store the sum
        int C[][] = new int[size][size];

        // Iterate through all rows and columns to add corresponding elements
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j]; // Add corresponding elements

        // Return the result matrix
        return C;
    }

    // Driver code
    public static void main(String[] args) {
        int size = 4; // Size of the matrices

        // Matrix A initialization
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        // Print matrix A
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        // Matrix B initialization
        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        // Print matrix B
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);

        // Add the two matrices A and B
        int C[][] = add(A, B, size);

        // Print the resultant matrix
        System.out.println("\nResultant Matrix (A + B):");
        printMatrix(C, size, size);
    }
}
