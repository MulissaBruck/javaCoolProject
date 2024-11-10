
import java.util.Scanner;

public class findPorcupineNumber4 {

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
        int nextPrimeEnd9;

        while (true) {
            nextPrimeEnd9 = findNextPrimeNo(n);

            if (nextPrimeEnd9 % 10 == 9) { // Check if it ends with 9
                int followingPrime = findNextPrimeNo(nextPrimeEnd9);

                if (followingPrime % 10 == 9) { // Check if the next prime also ends with 9
                    System.out.println("First porcupine number: " + nextPrimeEnd9);
                    System.out.println("Following prime ending with 9: " + followingPrime);
                    return nextPrimeEnd9;
                }
            }

            // Continue searching from the next prime
            n = nextPrimeEnd9;
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
