public class findNextPrime4 {

    public static int FindNextPrimeNum(int n) {
        int nextNum = n + 1;
        for (int i = 2; i < nextNum / 2; i++) {
            if (nextNum % i == 0) {

                nextNum++;
            }
        }
        return nextNum;
    }

    public static void main(String[] args) {

        int n = 11;

        System.out.println(FindNextPrimeNum(n));

    }

}
