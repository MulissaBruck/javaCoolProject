import java.util.Arrays;

public class encodedPrimeFactors4 {

    public static int isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int[] encodePrimeFactors(int n) {
        int[] encoded = new int[20];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (isPrime(i) == 1) {
                    encoded[index++] = i;

                }
                n = n / i;

            }

        }
        // Return only the filled part of the array
        return Arrays.copyOf(encoded, index);

    }

    public static void main(String[] args) {
        int n = 120; // Example number
        System.out.println(" Encoded Prime factors array are " + Arrays.toString(encodePrimeFactors(n)));
        // encodePrimeFactors(n);
    }
}
