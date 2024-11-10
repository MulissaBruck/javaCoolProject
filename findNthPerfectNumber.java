import java.util.Scanner;

public class findNthPerfectNumber {

    public static int findNthPerfectNumber(int nth) {
        int count = 0, i;
        for (i = 2; i > 0 && count < nth; i++) {
            if (sumOfFactors(i) == i) {
                count++;
            }
        }
        System.out.println(count);
        return sumOfFactors(i - 1);
        // or return sumOfFactors i;

    }

    // Method to calculate the sum of factors of a number
    public static int sumOfFactors(int n) {
        int factorSum = 0;

        // Loop from 1 to n and check for factors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                // Add the factor to the sum
                factorSum += i;
            }
        }

        return factorSum;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        // Output the sum of factors
        System.out.println("The sum of factors: " + findNthPerfectNumber(n));
        input.close();
    }
}
