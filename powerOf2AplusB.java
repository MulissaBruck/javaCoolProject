import java.util.Scanner;

public class powerOf2AplusB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int t = scanner.nextInt();

        // Process each query
        for (int i = 0; i < t; i++) {
            // Read the values for a, b, and n
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Initialize variables
            int sum = 0; // To store the sum of powers of 2
            int powerOf2 = 1; // The first power of 2 (2^0 = 1)

            // Generate and print the series for this query
            for (int j = 0; j < n; j++) {
                sum += powerOf2; // Add the current power of 2 to the sum
                System.out.print(a + b * sum + " "); // Print the current term of the series

                // Update powerOf2 for the next iteration (next power of 2)
                powerOf2 = powerOf2 * 2; // Equivalent to multiplying by 2 each time
            }
            System.out.println(); // Move to the next line after printing all terms of the current query
        }

        scanner.close(); // Close the scanner
    }
}
