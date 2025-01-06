import java.util.Scanner;

public class findPorcupineNumber9 {

    // Method to find the next porcupine number
    public static int findPorcupineNumber(int startNumber) {

        // Infinite loop until we find the correct porcupine number
        while (true) {
            // Find the next prime number greater than 'startNumber'
            int currentPrime = findNextPrime(startNumber);
            System.out.println("Checking prime number: " + startNumber);

            // Check if the current prime ends with 9
            if (endsWith9(currentPrime)) {
                System.out.println("Found prime ending with 9: " + currentPrime);

                // Find the next prime after the currentPrime
                int nextPrime = findNextPrime(currentPrime);

                // Check if the next prime also ends with 9
                if (endsWith9(nextPrime)) {
                    System.out.println("Next prime also ends with 9: " + nextPrime);

                    // If both primes end in 9, return the current prime as the porcupine number
                    return currentPrime;
                }
            }

            // Update 'startNumber' to the found prime and repeat the process
            startNumber = currentPrime;
        }
    }

    // Helper method to check if a number ends with 9
    public static boolean endsWith9(int number) {
        // Returns true if the last digit of the number is 9, otherwise false
        return number % 10 == 9;
    }

    // Method to find the next prime number greater than 'num'
    public static int findNextPrime(int num) {
        num++; // Start checking from the next number after 'num'

        // Loop until a prime number is found
        while (true) {
            // Flag to check if the current number is prime
            boolean isPrime = true;

            // Check divisibility from 2 up to num/2
            for (int i = 2; i <= num / 2; i++) {
                // If divisible, it is not a prime
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further if the number is already divisible
                }
            }

            // If the number is prime, return it
            if (isPrime) {
                return num;
            }

            // Otherwise, increment the number and check the next number
            num++;
        }

        /*
         * public static int findNextPrime(int num) {
         * num++;
         * for (int i = 2; i < num / 2; i++) {
         * if (num % i == 0) {
         * num++;
         * i = 1; // if i = 2; the result is different Note.
         * }
         * }
         * return num;
         * }
         */
    }

    // Main method to drive the program
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number to find the next porcupine number
        System.out.println("Enter a number to find the next porcupine number:");
        int startingNumber = scanner.nextInt();

        // Call the method to find the porcupine number and print the result
        System.out.println("Porcupine number: " + findPorcupineNumber(startingNumber));

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
