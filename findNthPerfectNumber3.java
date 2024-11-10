import java.util.Scanner;

public class findNthPerfectNumber3 {

    // Method to check if the sum of factors of a number equals the number itself
    // (Perfect number check)
    public static int checkfactorSum(int num) {
        int factorSum = 0;

        // Loop through all numbers less than num and find factors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factorSum += i; // Add the factor to the sum
            }
        }

        return factorSum;
    }

    // Method to find the nth perfect number
    public static int factorSum(int nth) {
        int count = 0; // To count how many perfect numbers have been found
        int num = 0; // Current number being checked
        int perfectNum = 0; // To store the nth perfect number

        // Loop to find the nth perfect number
        for (int j = 1; count < nth; j++) {
            // If the number is a perfect number, i.e., the sum of its factors equals the
            // number itself
            if (checkfactorSum(j) == j) {
                count++; // Increment count of perfect numbers found
                num = j; // Keep track of the current perfect number
            }
        }

        // After the loop finishes, store the nth perfect number
        perfectNum = num;

        return perfectNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for which nth perfect number they want
        System.out.println("Enter the value of nth (to find the nth perfect number): ");
        int nth = input.nextInt();

        // Print the nth perfect number
        System.out.println("The " + nth + "th perfect number is: " + factorSum(nth));

        // Close the scanner
        input.close();
    }
}
