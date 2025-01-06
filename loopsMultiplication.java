import java.util.Scanner;

public class loopsMultiplication {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the integer N
        int N = sc.nextInt();

        // Loop through numbers 1 to 10 and print the multiples
        for (int i = 1; i <= 10; i++) {
            // Print the multiple in the required format
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }

        // Close the scanner
        sc.close();
    }
}
