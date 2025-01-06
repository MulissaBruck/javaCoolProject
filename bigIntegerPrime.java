import java.math.BigInteger;
import java.util.Scanner;

public class bigIntegerPrime {
    public static void main(String[] args) {
        // Step 1: Input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Step 2: Create BigInteger instance
        BigInteger number = new BigInteger(input);

        // Step 3: Check primality
        if (number.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
