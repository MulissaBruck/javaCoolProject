public class findNextPrime5 {

    public static int nextPrime(int n) {
        n++;
        while (true) {
            boolean prime = true;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == false) {
                n++;
            }

            return n;
        }
    }

    public static void manin(String[] args) {

        int n = 10;

        System.out.println("Next Prime No of " + n + ":" + nextPrime(n));
    }
}
