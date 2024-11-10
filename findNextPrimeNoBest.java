import java.util.Scanner;

public class findNextPrimeNoBest {

    // Function to find the next prime number after n
    public static int findNextPrimeNumber(int n) {
        int next = n + 1; // Start checking from the next number
        int i = 2; // Start divisor from 2

        // Loop to find the next prime number
        while (i < next) {
            if (next % i == 0) {
                // If next is divisible by i, it's not prime, so we increment next
                next++;
                i = 2; // Reset i to 2 to check the new 'next' number
            } else {
                i++; // Increment i to check the next divisor
            }
        }

        return next; // When we exit the loop, 'next' is a prime number
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter number To find Next Prime No :");

        int n = input.nextInt(); // Example: Find the next prime after 10
        System.out.println("Next prime after " + n + " is: " + findNextPrimeNumber(n));

        input.close();
    }
}
