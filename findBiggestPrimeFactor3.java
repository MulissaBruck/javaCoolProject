import java.util.Scanner;

public class findBiggestPrimeFactor3 {

    // Method to find the largest prime factor of a number
    public static int largestPrimeFactor(int n) {

        int currentFactor;
        int higherFactor = 0;

        // Loop through all numbers from 2 up to n
        for (int i = 2; i <= n; i++) {
            // While n is divisible by i, it means i is a factor
            while (n % i == 0) {
                currentFactor = i;
                n /= i; // Divide n by the current factor

                // Update the highest factor
                if (currentFactor > higherFactor) {
                    higherFactor = currentFactor;
                }
            }
        }

        return higherFactor;
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
