import java.math.BigInteger;
import java.util.Scanner;

public class bigIntegerPrime2 {
    public static void main(String[] args) {
        // Step 1: Input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Step 2: Create BigInteger instance
        BigInteger number = new BigInteger(input);

        // Step 3: Check primality manually
        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    // Method to manually check if a number is prime
    public static boolean isPrime(BigInteger number) {
        // Step 4: Handle base cases
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false; // Numbers <= 1 are not prime
        }

        if (number.compareTo(BigInteger.TWO) == 0) {
            return true; // 2 is prime
        }

        if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return false; // Even numbers greater than 2 are not prime
        }

        // Step 5: Check divisibility from 3 to sqrt(number)
        BigInteger sqrt = number.sqrt(); // Square root of the number
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.TWO)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false; // Divisible by i, not prime
            }
        }

        return true; // Number is prime
    }
}
