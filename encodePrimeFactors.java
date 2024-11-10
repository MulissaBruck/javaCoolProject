import java.util.Arrays;

public class encodePrimeFactors {

    public static int[] encodePrimeFactors(int n) {
        int count = 0, index = 0;
        int[] PrimeFactors = new int[10];
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                // if (index == 0 || PrimeFactors[index - 1] != i) {
                PrimeFactors[index++] = i;
                count++;
                System.out.println(count);
                // }
                n = n / i;
            }

        }
        int[] encoded = new int[count];

        for (int i = 0; i < count; i++) {
            encoded[i] = PrimeFactors[i];
        }

        return encoded;
    }

    public static void main(String[] args) {
        int n = 120; // Example number
        System.out.println(" Encoded Prime factors array are " + Arrays.toString(encodePrimeFactors(n)));
        // encodePrimeFactors(n);
    }
}
