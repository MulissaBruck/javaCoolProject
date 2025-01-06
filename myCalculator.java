import java.util.Scanner; // Importing Scanner class to allow reading user input

// Custom class for calculator functionality
class MyCalculator {
    /*
     * Computes the value of n raised to the power of p.
     * 
     * @param n: Base integer (e.g., 2 in 2^3)
     * 
     * @param p: Exponent integer (e.g., 3 in 2^3)
     * 
     * @return A long value representing n^p (e.g., 2^3 = 8)
     * 
     * @throws Exception if:
     * - Both n and p are zero, which is undefined
     * - Either n or p is negative, which is disallowed in this program
     */
    long power(int n, int p) throws Exception {
        // If both n and p are zero, throw an exception as 0^0 is undefined
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        // If either n or p is negative, throw an exception as negative values are
        // disallowed
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        // Compute n^p using Math.pow and cast the result to a long to handle larger
        // results
        return (long) Math.pow(n, p);
    }
}

// Main class to interact with the calculator
public class myCalculator {
    // Create a single instance of MyCalculator (to ensure reusable access)
    public static final MyCalculator my_calculator = new MyCalculator();

    // Create a static Scanner instance to read user input from the console
    public static final Scanner in = new Scanner(System.in);

    /*
     * The main method serves as the entry point of the program.
     * It takes multiple pairs of integers as input, computes their power using
     * MyCalculator, and handles exceptions gracefully.
     */
    public static void main(String[] args) {
        // Loop to keep reading input until no more integers are available in the input
        // stream
        while (in.hasNextInt()) {
            int n = in.nextInt(); // Read the base number
            int p = in.nextInt(); // Read the exponent

            try {
                // Call the power method to compute n^p and print the result
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                // If an exception occurs, print the exception's message
                System.out.println(e.getMessage());
            }
        }
    }
}
