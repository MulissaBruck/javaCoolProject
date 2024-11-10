import java.util.Arrays;
import java.util.Scanner;

public class isTrivalent7 {

    // Method to check if the array is trivalent (contains exactly 3 distinct
    // values)
    public static int isTrivalent(int[] a) {
        int aLength = a.length;

        if (aLength < 3) {
            // An array with fewer than 3 elements cannot be trivalent
            return 0;
        }

        // Sort the array to group identical values together
        Arrays.sort(a);

        // Initialize distinctCount to 0
        int distinctCount = 0;
        int previousValue = a[0]; // Start with the first element

        // Count the number of distinct values
        for (int i = 0; i < aLength; i++) {
            if (i == 0 || a[i] != previousValue) {
                distinctCount++;
                previousValue = a[i]; // Update previousValue to the current value
            }
        }

        // Check if there are exactly 3 distinct values
        if (distinctCount == 3) {
            return 1; // The array is trivalent
        } else {
            return 0; // The array is not trivalent
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements:");
        int length = input.nextInt();

        // Create an array of the specified length
        int[] a = new int[length];

        // Read elements into the array from user input
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = input.nextInt();
        }

        // Check if the array is trivalent and display the result
        if (isTrivalent(a) == 1) {
            System.out.println("The array is trivalent.");
        } else {
            System.out.println("The array is not trivalent.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
