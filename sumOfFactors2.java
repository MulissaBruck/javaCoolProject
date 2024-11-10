import java.util.Scanner;

public class sumOfFactors2 {

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
        System.out.println("The sum of factors: " + sumOfFactors(n));
        input.close();
    }
}
