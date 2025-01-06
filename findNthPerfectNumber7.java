import java.util.Scanner;

public class findNthPerfectNumber7 {

    public static long findNthPerfectNumber(int nth) {
        long count = 0; // Counter for the number of perfect numbers found
        long num = 2; // Start checking from 2 (since 1 is not a perfect number)

        // Loop until we find the nth perfect number
        while (count < nth) {
            if (isPerfectNumber(num)) {
                count++; // Increment count when a perfect number is found
                if (count == nth) { // If the nth perfect number is found, return it
                    return num;
                }
            }
            num++;
        }
        return -1; // This line will never be reached
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(long num) {
        long sum = 1; // Start with 1 since it's a divisor of every number
        for (long i = 2; i <= num / 2; i++) { // Check divisors up to num / 2
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }
        return sum == num && num != 1; // A perfect number is equal to the sum of its proper divisors
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n to find the nth perfect number: ");
        int n = scanner.nextInt();
        scanner.close();

        long nthPerfectNumber = findNthPerfectNumber(n);

        if (nthPerfectNumber > 0) {
            System.out.println("The " + n + "th perfect number is: " + nthPerfectNumber);
        } else {
            System.out.println("Unable to find the " + n + "th perfect number. Try a smaller value.");
        }
    }
}
