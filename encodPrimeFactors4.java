import java.util.Arrays;

public class encodPrimeFactors4 {

    public static int[] encodePrimeFactors(int n) {

        int[] encodedPrimeFac = new int[10];

        int i = 2;
        int count = 0;
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                if (isPrime(i) == true) {
                    encodedPrimeFac[count++] = i;
                }
            }
            if (n % i != 0)
                i++;

        }
        int[] encodeLastPrimFac = new int[count];
        for (int j = 0; j < count; j++) {
            encodeLastPrimFac[j] = encodedPrimeFac[j];
        }

        return encodeLastPrimFac;
    }

    public static boolean isPrime(int fact) {

        for (int i = 2; i < fact; i++) {
            if (fact % i == 0) {
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
