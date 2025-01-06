public class printRectangleWxL {
    public static void main(String[] args) {
        int w = 10; // Width of the rectangle
        int h = 9; // Height of the rectangle

        // Print the first row (full line of stars)
        for (int i = 0; i < w; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after printing the first row

        // Print the middle part (stars at the edges with spaces in between)
        for (int j = 0; j < h - 2; j++) { // We need h-2 for the middle rows, as the first and last rows are already
                                          // printed
            System.out.print("*"); // Print the first star
            for (int k = 0; k < w - 2; k++) { // Print spaces between the stars
                System.out.print(" ");
            }
            System.out.println("*"); // Print the last star and move to the next line
        }

        // Print the last row (full line of stars)
        for (int l = 0; l < w; l++) {
            System.out.print("*");
        }
    }
}
