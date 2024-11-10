import java.util.Scanner;

public class findPorcupineNoBest {

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
        while (true) {
            int nextPrimeNo = findNextPrimeNo(n);

            if (nextPrimeNo % 10 == 9) { // First prime ending in 9
                int followingPrime = findNextPrimeNo(nextPrimeNo);

                if (followingPrime % 10 == 9) { // Following prime also ends in 9
                    System.out.println("Porcupine number: " + nextPrimeNo);
                    System.out.println("Following prime ending with 9: " + followingPrime);
                    return nextPrimeNo;
                }
            }

            // Move to the next prime if conditions aren’t met
            n = nextPrimeNo;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find the next porcupine number:");
        int n = input.nextInt();

        System.out.println("Porcupine number: " + findPorcupineNo(n));

        input.close();
    }
}
