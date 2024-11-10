
import java.util.*;

public class FindPorcupineNumber {

    public static int checkEnd9(int n) {

        if (n % 10 == 9) {

            return 1;
        }

        return 0;

    }

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
                System.out.println(" Next prime number " + nextNum);

            }
        }

    }

    public static int findPorcupine(int n) {
        int nextPrime = findNextPrimeNum(n);
        int nextNextPrimeE9 = 0;
        System.out.println("the original numb +1 =" + n);
        System.out.println("the next prime  =" + nextPrime);

        while (checkEnd9(nextPrime) != 1) {

            nextPrime++;
            nextPrime = findNextPrimeNum(nextPrime);

        }
        System.out.println(" th next prime that end with 9 : " + nextPrime);
        nextNextPrimeE9 = findNextPrimeNum(nextPrime);
        System.out.println("the number nextNextPrimeE9  end with 9 :" + nextNextPrimeE9);
        if (nextNextPrimeE9 % 10 == 9) {
            System.out.println("the number n are Pocrpin no :" + nextPrime);

            return 1;
        } else
            System.out.println("the number is not  :" + nextPrime);
        return 0;

    }

    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter number for porcupine num  check : ");

        int num = input.nextInt();

        System.out.println(findPorcupine(num));

        input.close();

    }

}
