
import java.util.Scanner;

public class FindPorcupineNumber2 {

    public static int findNextPrimeNo(int n) {
        int nextnum = n + 1;
        while (true) {
            int i;
            for (i = 2; i < nextnum; i++) {

                if (nextnum % i == 0) {
                    nextnum++;
                    break;
                }
            }
            if (i == nextnum) {
                return nextnum;
            }

        }

    }

    public static int findPorcupineNo(int n) {

        int nextPrimeNo = findNextPrimeNo(n);

        while (nextPrimeNo % 10 != 9 || findNextPrimeNo(nextPrimeNo) % 10 != 9) {
            n++;
            nextPrimeNo = findNextPrimeNo(n);

        }
        System.out.println(n);
        System.out.println(nextPrimeNo);
        System.out.println(findNextPrimeNo(nextPrimeNo));

        nextPrimeNo = findNextPrimeNo(n);
        System.out.println(" next prime end with 9 : " + nextPrimeNo);

        if (findNextPrimeNo(nextPrimeNo) % 10 == 9) {

            System.out.println(" next prime  end with 9 after next prime : " + findNextPrimeNo(nextPrimeNo));
            return nextPrimeNo;

        } else
            System.out.println(" next prime not end with 9 after next prime : " + findNextPrimeNo(nextPrimeNo));

        return 0;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find the next porcupine number:");
        int n = input.nextInt();

        System.out.println("Porcupine number: " + findPorcupineNo(n));

        input.close();
    }
}
