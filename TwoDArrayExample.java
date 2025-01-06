import java.util.Scanner;

public class TwoDArrayExample {

    public static void main(String[] args) {
        // Initialize a 6x6 2D array
        int[][] grid = new int[6][6];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter elements for the 6x6 grid
        System.out.println("Enter the elements of the 6x6 grid row by row:");

        // Loop to read the grid values from the user
        for (int i = 0; i < 6; i++) { // Loop over rows
            for (int j = 0; j < 6; j++) { // Loop over columns
                System.out.print("Enter element for row " + (i + 1) + ", column " + (j + 1) + ": ");
                grid[i][j] = scanner.nextInt();
            }
        }

        scanner.close(); // Close the scanner

        // Display the entered 6x6 grid
        System.out.println("\nYou entered the following 6x6 grid:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
