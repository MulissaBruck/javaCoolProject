import java.util.Scanner;

public class findNextPrime {

    public static int findNextPrimeNum(int n) {
        int nextNum = n + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i < nextNum; i++) {
                if (nextNum % i == 0) {
                    isPrime = false;
                    nextNum++; // Increment nextNum if it’s not prime
                    break; // Exit the loop and check the new nextNum
                }
            }
            if (isPrime) {
                return nextNum; // Return if nextNum is confirmed as prime
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Number To find next prime Number :");
        int n = input.nextInt();
        System.out.println(findNextPrimeNum(n));

        input.close();

    }
}
