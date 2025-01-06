import java.util.Scanner;

public class ThreeDArrayExample {

    public static void main(String[] args) {
        // Initialize a 3x3x3 3D array
        int[][][] array = new int[3][3][3];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter elements for the 3D array
        System.out.println("Enter the elements of the 3x3x3 array:");

        // Loop to input values into the 3D array
        for (int i = 0; i < 3; i++) { // First dimension
            for (int j = 0; j < 3; j++) { // Second dimension
                for (int k = 0; k < 3; k++) { // Third dimension
                    System.out.print("Enter element for position [" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }

        scanner.close(); // Close the scanner

        // Display the 3D array
        System.out.println("\nYou entered the following 3x3x3 array:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Separate layers visually
        }
    }
}
