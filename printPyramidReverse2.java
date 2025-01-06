public class printPyramidReverse2 {

    public static void main(String[] args) {

        int rows = 7; // Number of rows for the pyramid

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int k = 0; k < (2 * (rows - i) - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
