import java.util.Arrays;

public class encodedPrimeFactors3 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; // No factors found, it's prime
    }

    // Method to encode a number and return its prime factors
    public static int[] encodeNumber(int n) {
        int[] primeFactors = new int[9]; // Initial size of 9
        int j = 0; // Counter for the number of prime factors found

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                // Check if the current factor is prime
                if (isPrime(i)) {
                    // Check if we need to resize the array
                    if (j == primeFactors.length) {
                        // Resize the array to double its size
                        primeFactors = Arrays.copyOf(primeFactors, primeFactors.length * 2);
                    }
                    primeFactors[j] = i; // Store the prime factor
                    j++; // Increment the counter
                }
                n /= i; // Divide n by the current factor
            }
        }

        // Return only the filled part of the array
        return Arrays.copyOf(primeFactors, j);
    }

    public static void main(String[] args) {
        int n = 120; // Example number to factor
        System.out.println("Prime factors array: " + Arrays.toString(encodeNumber(n)));
    }
}
