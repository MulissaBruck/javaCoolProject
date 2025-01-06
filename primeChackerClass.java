import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class primeChackerClass {

    public static void main(String[] args) {
        try {
            // Ask the user to enter five integers, one by one
            System.out.println("Please enter 5 integers (one per line):");

            // Reading 5 integers from the user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine()); // First number entered by the user
            int n2 = Integer.parseInt(br.readLine()); // Second number entered by the user
            int n3 = Integer.parseInt(br.readLine()); // Third number entered by the user
            int n4 = Integer.parseInt(br.readLine()); // Fourth number entered by the user
            int n5 = Integer.parseInt(br.readLine()); // Fifth number entered by the user

            // Create an instance of the Prime class to use the checkPrime method
            Prime ob = new Prime();

            // Call the checkPrime method with different numbers of arguments
            System.out.println("Prime numbers in the list for each input set:");

            ob.checkPrime(n1); // Check primes for just the first number
            ob.checkPrime(n1, n2); // Check primes for the first two numbers
            ob.checkPrime(n1, n2, n3); // Check primes for the first three numbers
            ob.checkPrime(n1, n2, n3, n4, n5); // Check primes for all five numbers

            // Reflection code to ensure that there is no method overloading
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true; // If a method is overloaded, set the flag
                    break;
                }
                set.add(methods[i].getName());
            }
            // If overloading is detected, throw an exception
            if (overload) {
                throw new Exception("Overloading not allowed");
            }

        } catch (Exception e) {
            // Catch any exceptions and print the error
            System.out.println(e);
        }
    }
}

class Prime {

    // Method to check if numbers are prime. It takes a variable number of integer
    // arguments.
    public void checkPrime(int... nums) {
        // Loop through all the numbers passed in the method
        for (int num : nums) {
            // If the number is prime, print it
            if (isPrime(num)) {
                System.out.print(num + " "); // Print the prime number followed by a space
            }
        }
        // Print a new line after printing prime numbers
        System.out.println();
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        // If the number is less than or equal to 1, it's not prime
        if (num <= 1) {
            return false;
        }
        // The number 2 is prime, return true immediately
        if (num == 2) {
            return true;
        }
        // If the number is even and greater than 2, it's not prime
        if (num % 2 == 0) {
            return false;
        }
        // Loop from 3 to the square root of the number to check divisibility
        // Only odd numbers need to be checked, as even numbers are already eliminated
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        // If no divisor is found, the number is prime
        return true;
    }
}
