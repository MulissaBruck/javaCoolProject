import java.util.Scanner;

public class findNthPerfectNumber2 {

    // Helper method to calculate the sum of divisors excluding the number itself
    public static int checkFactorSum(int num) {
        int factorSum = 0;

        // Calculate the sum of divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factorSum += i;
            }
        }

        return factorSum;
    }

    // Method to find the nth perfect number
    public static int findNthPerfectNumber(int nth) {
        int count = 0; // Count the number of perfect numbers found
        int num = 1; // Start checking from 1
        int perfectNum = 0; // Placeholder for the nth perfect number

        while (count < nth) { // Continue until we find the nth perfect number
            if (checkFactorSum(num) == num) { // If the number is perfect
                count++; // Increment the count of perfect numbers found

                if (count == nth) {
                    perfectNum = num; // Store the nth perfect number
                }
            }
            num++; // Check the next number
        }

        return perfectNum; // Return the nth perfect number
    }

    // Method to find the sum of the ith and jth perfect numbers
    public static int henry(int i, int j) {
        int ithPerfect = findNthPerfectNumber(i); // Find the ith perfect number
        int jthPerfect = findNthPerfectNumber(j); // Find the jth perfect number

        return ithPerfect + jthPerfect; // Return their sum
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of i (for the ith perfect number): ");
        int i = input.nextInt();

        System.out.println("Enter the value of j (for the jth perfect number): ");
        int j = input.nextInt();

        // Calculate and print the sum of the ith and jth perfect numbers
        System.out.println("The sum of the " + i + "th and " + j + "th perfect numbers is: " + henry(i, j));

        input.close();
    }
}
