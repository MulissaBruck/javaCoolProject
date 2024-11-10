import java.util.Arrays;
import java.util.Scanner;

public class isTrivalent8 {

    // Method to check if the array is trivalent (contains exactly 3 distinct
    // values)
    public static int isTrivalent(int[] a) {
        int aLength = a.length;

        // An array with fewer than 3 elements cannot be trivalent
        if (aLength < 3) {
            return 0; // Return 0 since it's impossible to have 3 distinct values in less than 3
                      // elements
        }

        // Sort the array to group identical values together for easier distinct
        // counting
        Arrays.sort(a);

        // Initialize distinctCount to count distinct values
        int distinctCount = 1; // At least one value is present (the first element)

        // Count the number of distinct values in the array
        for (int i = 1; i < aLength; i++) {
            // Check if the current element is different from the previous element
            if (a[i] != a[i - 1]) {
                distinctCount++; // Increment distinctCount when a new distinct value is found
            }
        }

        // Check if the array has exactly 3 distinct values
        if (distinctCount == 3) {
            return 1; // Return 1 indicating the array is trivalent
        } else {
            return 0; // Return 0 indicating the array is not trivalent
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter the number of elements:");
        int length = input.nextInt(); // Read the length of the array

        // Create an array of the specified length
        int[] a = new int[length];

        // Loop to input each element into the array
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = input.nextInt(); // Read the elements from the user
        }

        // Check if the array is trivalent using the isTrivalent method and display the
        // result
        if (isTrivalent(a) == 1) {
            System.out.println("The array is trivalent."); // Print if the array is trivalent
        } else {
            System.out.println("The array is not trivalent."); // Print if the array is not trivalent
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
