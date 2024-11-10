public class findNextPrime2 {

    public static int FindNextPrimeNum(int n) {
        int nextnum = n + 1;
        while (true) {
            for (int i = 2; i < nextnum; i++) {

                if (nextnum % i == 0) {
                    nextnum++;
                    break;
                }
            }

            return nextnum;
        }

    }

    public static void main(String[] args) {

        int n = 7;

        System.out.println(FindNextPrimeNum(n));

    }

}
