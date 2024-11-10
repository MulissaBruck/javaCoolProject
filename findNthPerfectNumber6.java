import java.util.Scanner;

public class findNthPerfectNumber6 {

    // Method to calculate the sum of factors of a number
    public static int sumOfFactors(int num) {
        int factorSum = 0;

        // Loop through all numbers less than num to find factors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factorSum += i; // Add the factor to the sum
            }
        }

        return factorSum;
    }

    // Method to find the nth perfect number but it introducce the max itrations

    public static int findNthPerfectNumber(int nth) {
        int count = 0; // To count how many perfect numbers have been found
        int number = 1; // Start checking from 1
        int perfectNum = 0; // To store the nth perfect number
        int maxIterations = 100000; // Set a maximum limit on iterations

        while (count != nth && number < maxIterations) {
            if (sumOfFactors(number) == number) {
                count++; // Increment the count of perfect numbers found
                perfectNum = number; // Update the perfect number found
            }
            number++; // Move to the next number
        }

        if (count != nth) {
            System.out.println(
                    "Could not find the " + nth + "th perfect number within " + maxIterations + " iterations.");
            return -1; // Indicate failure to find the nth perfect number
        }

        return perfectNum; // Return the nth perfect number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for which nth perfect number they want
        System.out.println("Enter the value of nth (to find the nth perfect number): ");
        int nth = input.nextInt();

        // Print the nth perfect number
        int result = findNthPerfectNumber(nth);
        if (result != -1) {
            System.out.println("The " + nth + "th perfect number is: " + result);
        }

        // Close the scanner
        input.close();
    }
}
