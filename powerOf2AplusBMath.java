import java.util.Scanner;

public class powerOf2AplusBMath {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of queries
        int t = sc.nextInt();

        // Loop over each query
        for (int i = 0; i < t; i++) {
            // Read the values for a, b, and n
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // Initialize a variable to accumulate the sum of powers of 2
            int sum = 0;

            // Generate the series and print each term
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j); // Add the current power of 2
                System.out.print(a + b * sum + " "); // Print the term
            }
            System.out.println(); // Move to the next line after each query
        }

        // Close the scanner
        sc.close();
    }
}
