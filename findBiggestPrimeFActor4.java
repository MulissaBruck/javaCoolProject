import java.util.Scanner;

public class findBiggestPrimeFActor4 {

    // Method to find the largest prime factor of a number
    public static int largestPrimeFactor(int n) {
        int largestFactor = -1; // Initialize largestFactor to store the largest prime factor

        // Divide out all the factors of 2 (smallest prime factor)
        while (n % 2 == 0) {
            largestFactor = 2; // If n is divisible by 2, update largestFactor to 2
            n /= 2; // Divide n by 2 to remove the factor of 2
        }

        // Now that n is odd, start checking for odd factors from 3
        for (int i = 3; i <= n; i += 2) { // Increment by 2 to check only odd numbers
            while (n % i == 0) { // If i is a factor of n
                largestFactor = i; // Update largestFactor to the current odd factor
                n /= i; // Divide n by the current factor to reduce it
            }
        }

        return largestFactor; // Return the largest prime factor found
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input a number
        System.out.println("Enter a number to find its largest prime factor:");
        int n = input.nextInt(); // Store the user's input

        // Output the largest prime factor of the entered number
        System.out.println("The largest prime factor is: " + largestPrimeFactor(n));

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
