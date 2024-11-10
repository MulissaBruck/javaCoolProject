import java.util.Scanner;

public class findLargestFactor {

    // Method to find the largest factor of a number
    public static int largestFactor(int n) {
        int largestFactor = 1; // Initialize the largest factor to 1 (since 1 is a factor of every number)

        // Loop through all numbers from 1 up to n
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                largestFactor = i; // Update largest factor
            }
        }

        return largestFactor; // Return the largest factor found
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to find its largest factor:");
        int n = input.nextInt();

        // Output the largest factor
        System.out.println("The largest factor is: " + largestFactor(n));

        // Close the scanner
        input.close();
    }
}
