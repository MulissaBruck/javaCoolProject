import java.util.Scanner;

public class nextPerfectSquare2 {

    public static int nextPerfectSqure(int num) {

        int next = num + 1;

        while (true) {

            for (int i = 1; i * i <= next; i++) {

                if (i * i == next) {
                    return i;
                }
                System.out.println(i * i);
            }
            next++;
            System.out.println("next" + next);
        }

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
