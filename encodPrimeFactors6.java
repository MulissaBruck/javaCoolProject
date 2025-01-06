import java.util.Arrays;

public class encodPrimeFactors6 {
    public static int[] encodePrimeFactors(int n) {
        int[] PrimeFactors = new int[6];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                PrimeFactors[count++] = i;
                n = n / i;
            }

        }
        return Arrays.copyOf(PrimeFactors, 5);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 120; // Example number
        System.out.println(" Encoded Prime factors array are " + Arrays.toString(encodePrimeFactors(n)));
        // encodePrimeFactors(n);
    }
}
