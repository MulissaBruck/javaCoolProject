public class printPyramidPascalTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle

        // Generate Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print numbers in Pascal's Triangle
            int num = 1; // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Compute next number in the row
                num = num * (i - j) / (j + 1);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
