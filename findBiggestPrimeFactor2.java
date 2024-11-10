
import java.util.Scanner;

public class findBiggestPrimeFactor2 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false; // Found a divisor, so it's not prime
        }
        return true; // If no divisors were found, it's prime
    }

    // Method to find the largest prime factor of a number
    public static int largestPrimeFactor(int n) {
        int currentFactor;
        int higherFactor = 0;

        // Loop through all numbers from 2 up to n
        for (int i = 2; i <= n; i++) {
            // While n is divisible by i, it means i is a factor
            while (n % i == 0) {
                currentFactor = i; // Update current factor
                n /= i; // Divide n by the current factor

                // Check if currentFactor is prime before updating
                if (isPrime(currentFactor) && currentFactor > higherFactor) {
                    higherFactor = currentFactor; // Update the highest prime factor
                }
            }
        }

        return higherFactor; // Return the largest prime factor found
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to find its largest prime factor:");
        int n = input.nextInt();

        // Output the largest prime factor
        System.out.println("The largest prime factor is: " + largestPrimeFactor(n));

        // Close the scanner
        input.close();
    }
}
