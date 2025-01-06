import java.util.Arrays;

public class findPrimeRange {
    public static int[] findPrimesList(int num) {
        int[] primeList = new int[num];
        int index = 0;
        boolean prime = true;
        for (int i = 2; i < primeList.length; i++) {
            System.out.println(i);
            if (isPrime(i)) {
                primeList[index++] = i;
            }
        }

        int[] filterdPrime = new int[index];
        int i = 0;
        for (int n : primeList) {
            if (n != 0) {
                filterdPrime[i++] = n;
            }
        }
        return filterdPrime;
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 15;
        System.out.println(Arrays.toString(findPrimesList(num)));
    }
}
