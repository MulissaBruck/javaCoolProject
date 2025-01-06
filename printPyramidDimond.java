public class printPyramidDimond {
    public static void main(String[] args) {
        int n = 7; // The height of the diamond (half of the total height)

        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
