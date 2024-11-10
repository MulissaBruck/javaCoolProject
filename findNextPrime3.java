public class findNextPrime3 {

    public static int findNextPrimeNum(int n) {
        int nextNum = n + 1;
        while (true) {
            for (int i = 2; i < nextNum; i++) {
                if (nextNum % i == 0) {
                    nextNum++; // Increment nextNum if it’s not prime
                    break; // Exit the loop and check the new nextNum
                }
                // If no divisors found, meaning it's a prime, return nextNum
                if (i == nextNum - 1) {
                    return nextNum;
                }
            }
        }
    }

}
