import java.util.Scanner;

public class Area {

    // Declare static variables
    static int breadth; // Variable to store the breadth of the parallelogram
    static int height; // Variable to store the height of the parallelogram

    // Static initialization block
    static {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the values of breadth and height from the input
        breadth = sc.nextInt();
        height = sc.nextInt();

        // Check if either breadth or height is less than or equal to zero
        // If either value is invalid, print an exception message and exit the program
        if (breadth <= 0 || height <= 0) {
            // Print error message when breadth or height is not positive
            System.out.println("java.lang.Exception: Breadth and height must be positive");

            // Exit the program because the values are invalid
            System.exit(0); // Terminating the program here to prevent further execution
        }
    }

    // Main method where the area of the parallelogram is calculated
    public static void main(String[] args) {
        // If the static block didn't exit the program, the breadth and height are valid
        // Calculate the area of the parallelogram
        int area = breadth * height;

        // Print the area of the parallelogram
        System.out.println(area);
    }
}
