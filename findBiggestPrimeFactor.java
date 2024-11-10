import java.util.Scanner;

public class findBiggestPrimeFactor {

    public static int findBiggestPrimeFactor(int n) {

        int bigestPrimeFact = 1;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                if (bigestPrimeFact < isPrime(i)) {

                    bigestPrimeFact = isPrime(i);

                }
            }
        }

        return bigestPrimeFact;
    }

    public static int isPrime(int n) {
        for (int j = 2; j < n; j++) {

            if (n % j == 0) {
                return 0;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to find its largest prime factor:");
        int n = input.nextInt();

        // Output the largest prime factor
        System.out.println("The largest prime factor is: " + findBiggestPrimeFactor(n));

        // Close the scanner
        input.close();
    }

}
