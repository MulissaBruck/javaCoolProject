import java.util.Arrays;

public class encodePrimeFactors2 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, so not prime
            }
        }
        return true; // No factors found, so it is prime
    }

    // Method to find and store prime factors of a number
    public static int[] encodePrimeFactors(int n) {
        int[] primeFactors = new int[9]; // Initial size of 9
        int j = 0; // To count the number of prime factors found

        // Loop through all numbers from 2 to n to find prime factors
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) { // Check if i is a factor of n
                if (isPrime(i)) { // Check if the factor is prime
                    // Resize the array if needed
                    if (j == primeFactors.length) {
                        int[] newArray = new int[primeFactors.length * 2]; // Create a new array with double the size
                        System.arraycopy(primeFactors, 0, newArray, 0, primeFactors.length); // Copy existing elements
                                                                                             // to the new array
                        primeFactors = newArray; // Update the reference to the new array
                    }
                    primeFactors[j] = i; // Store the prime factor
                    j++; // Increment the count of prime factors found
                }
                n /= i; // Reduce n by the current factor
            }
        }

        // Return only the elements that were filled
        int[] result = new int[j];
        for (int k = 0; k < j; k++) {
            result[k] = primeFactors[k]; // Fill the result array with the prime factors
        }

        return result; // Return the array with the relevant prime factors
    }

    public static void main(String[] args) {
        int n = 120; // Example number
        System.out.println("Prime factors array is " + Arrays.toString(encodePrimeFactors(n)));
    }
}
