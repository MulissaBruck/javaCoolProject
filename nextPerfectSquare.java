import java.util.Scanner;

public class nextPerfectSquare {

    public static int nextPerfectSqure(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }
        int i = 1;
        int perfect = (int) Math.sqrt(n);
        System.out.println(perfect);
        while (n >= i * i) {

            if (n == i * i) {
                return i;
            }

            i++;
        }

        return i;

    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number to find the next perfect square
        System.out.println("Enter the next square to be perfected:");
        int num = input.nextInt();

        // Calculate and display the next perfect square greater than or equal to the
        // entered number
        System.out.println("The next perfect square of " + num + " is: " + nextPerfectSqure(num));

        // Close the scanner to free up resources
        input.close();
    }
}
