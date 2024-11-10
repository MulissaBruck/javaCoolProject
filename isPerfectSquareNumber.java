import java.util.*;

public class isPerfectSquareNumber {

    public static int isPerfectSquare(int n) {

        if (n < 0) {

            return 0;
        }

        if (n == 0) {
            return 1;
        }

        int perfect = (int) Math.sqrt(n);
        System.out.println(perfect);

        if (perfect * perfect < n)
            return 0;
        else
            return 1;

    }

    public static void main(String[] args) {
        // Test a single number
        int number = 25;

        // Check if the number is a perfect square
        if (isPerfectSquare(number) == 1) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is NOT a perfect square.");
        }

    }
}
