
public class findBiggestPrimeFactor5 {

    public static int encodePrimeFactors(int n) {
        int bigPrimeFac = 0;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
                bigPrimeFac = i;
            }
        }
        return bigPrimeFac;
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
        System.out.println(" Encoded Prime factors array are " + (encodePrimeFactors(n)));
        // encodePrimeFactors(n);
    }
}
