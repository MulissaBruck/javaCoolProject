public class printPyramidTriangleNo {

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers
            num -= 2; // Adjust to start from the previous number
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
