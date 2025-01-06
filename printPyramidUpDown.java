public class printPyramidUpDown {

    public static void main(String[] args) {

        int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Outer loop iterates through each row of the pyramid

            // Print spaces before the stars
            for (int j = 0; j < n - i; j++) {
                // Inner loop prints spaces to create the pyramid shape
                // The number of spaces decreases as the row number increases
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int j = 0; j < 2 * i - 1; j++) {
                // Inner loop prints the stars for the current row
                // The number of stars increases by 2 in each row
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

        }
        int rows = 5;
        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int k = 0; k < (rows * 2) - 1 - (i * 2); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}