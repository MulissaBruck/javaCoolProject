import java.util.Scanner;

public class findBiggestPrimeFactor7 {

    public static int findBiggestPrimeFactor(int n) {
        int largestPrimeFactor = 0;
        int i = 2;

        while (n > 1) {
            // If 'i' divides 'n'
            if (n % i == 0) {
                // Check if 'i' is prime
                if (isPrime(i)) {
                    // Update the largest prime factor
                    largestPrimeFactor = i;
                }
                // Reduce 'n' by dividing it by 'i'
                n = n / i;
            } else {
                // Move to the next number
                i++;
            }
        }

        return largestPrimeFactor;
    }

    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false;
        }
        // Check divisors up to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to find its largest prime factor:");
        int n = input.nextInt();

        // Output the largest prime factor
        System.out.println("The largest prime factor is: " + findBiggestPrimeFactor(n));

        // Close the scanner
        input.close();
    }
}
