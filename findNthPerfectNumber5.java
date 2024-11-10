import java.util.Scanner;

public class findNthPerfectNumber5 {

    // Method to calculate the sum of factors of a number
    public static int sumOfFactors(int n) {
        int factorSum = 0; // Initialize sum of factors

        // Loop through all numbers less than n to find factors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // Check if i is a factor of n
                factorSum += i; // Add the factor to the sum
            }
        }

        return factorSum; // Return the total sum of factors
    }

    // Method to find the nth perfect number
    public static int findNthPerfectNumber(int nth) {
        int count = 0; // To count how many perfect numbers have been found
        int number = 1; // Start checking from 1
        int perfectNum = 0; // To store the nth perfect number

        // Loop to find the nth perfect number
        while (count != nth) {
            // Check if the current number is a perfect number
            if (sumOfFactors(number) == number) {
                count++; // Increment the count of perfect numbers found
                perfectNum = number; // Update the perfect number found
            }
            number++; // Move to the next number
        }

        return perfectNum; // Return the nth perfect number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for which nth perfect number they want
        System.out.println("Enter the value of nth (to find the nth perfect number): ");
        int nth = input.nextInt();

        // Print the nth perfect number
        System.out.println("The " + nth + "th perfect number is: " + findNthPerfectNumber(nth));

        // Close the scanner
        input.close();
    }
}
