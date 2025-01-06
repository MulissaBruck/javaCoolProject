import java.util.ArrayList;
import java.util.Arrays;

public class encodPrimeFactors5 {

    // Method to encode prime factors of a number into an array
    public static int[] encodePrimeFactors(int n) {
        // List to store prime factors
        ArrayList<Integer> primeFactors = new ArrayList<>();

        int factor = 2; // Start checking from the smallest prime number
        while (n > 1) {
            // If 'factor' divides 'n', it is a prime factor
            while (n % factor == 0) {
                primeFactors.add(factor); // Add to the list
                n /= factor; // Reduce 'n' by dividing by 'factor'
            }
            factor++; // Check the next number
        }

        // Convert ArrayList<Integer> to int[] and return
        return primeFactors.stream().mapToInt(Integer::intValue).toArray();

        /*
         * Convert ArrayList<Integer> to primitive int[] using the given approach
         * int[] primitiveArray = new int[primeFactors.size()];
         * for (int i = 0; i < primeFactors.size(); i++) {
         * primitiveArray[i] = primeFactors.get(i);
         * }
         */
    }

    public static void main(String[] args) {
        // Example number to find prime factors
        int n = 120;

        // Call the function and print the result
        int[] primeFactors = encodePrimeFactors(n);
        System.out.println("Prime factors of " + n + ": " + Arrays.toString(primeFactors));

        // Another example
        n = 56;
        primeFactors = encodePrimeFactors(n);
        System.out.println("Prime factors of " + n + ": " + Arrays.toString(primeFactors));
    }
}
