import java.util.Scanner; // Import Scanner for user input

// Custom calculator class to compute n^p
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
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(n, p);
    }
}

// Main class
public class myCalculator2 {
    // Field to hold an instance of MyCalculator
    public final MyCalculator my_calculator = new MyCalculator(); // No longer static or shared

    /*
     * Main method where the program starts execution
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for user input

        // Create an instance of the myCalculator class
        myCalculator2 calculatorInstance = new myCalculator2();

        // Loop to process multiple input pairs
        while (in.hasNextInt()) {
            int n = in.nextInt(); // Read the base number
            int p = in.nextInt(); // Read the exponent

            try {
                // Access the 'my_calculator' field through the instance
                System.out.println(calculatorInstance.my_calculator.power(n, p));
            } catch (Exception e) {
                // Print the exception message if any error occurs
                System.out.println(e.getMessage());
            }
        }
        in.close(); // Close the Scanner
    }
}
