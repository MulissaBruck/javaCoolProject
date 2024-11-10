import java.util.Scanner;

public class findTheNextprime {

    public static int findTheNextPrime(int n) {
        if (n < 0) {
            return -1; // Return -1 if the input is negative
        }

        int root = (int) Math.sqrt(n); // Find the integer square root of n
        if (root * root == n) {
            return n; // If n is already a perfect square, return n itself
        } else {
            int nextRoot = root + 1; // Otherwise, go to the next integer
            return nextRoot * nextRoot; // Return the next perfect square
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number to find the next perfect square
        System.out.println("Enter a number to find its next perfect square:");
        int num = input.nextInt();

        // Calculate and display the next perfect square greater than or equal to the
        // entered number
        System.out.println("The next perfect square after " + num + " is: " + findTheNextPrime(num));

        // Close the scanner to free up resources
        input.close();
    }
}
