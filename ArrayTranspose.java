
// Java Program to find the transpose of a matrix
class ArrayTranspose {
    static final int M = 3; // Number of rows in the original matrix
    static final int N = 4; // Number of columns in the original matrix

    // Function to compute the transpose
    static void transpose(int A[][], int B[][]) {
        int i, j;
        // Iterate through the rows and columns of A
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                // Transpose: Swap row and column indices
                B[i][j] = A[j][i];
            }
        }
    }

    // Main driver method
    public static void main(String[] args) {
        // Define a 3x4 matrix A
        int A[][] = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 }
        };

        // Create a 4x3 matrix B to store the transpose
        int B[][] = new int[N][M];
        int i, j;

        // Compute the transpose of A and store it in B
        transpose(A, B);

        // Print the resulting transpose matrix
        System.out.print("Result matrix is:\n");
        for (i = 0; i < N; i++) { // Iterate through rows of B
            for (j = 0; j < M; j++) { // Iterate through columns of B
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
