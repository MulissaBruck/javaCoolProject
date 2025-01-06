import java.io.*;
import java.lang.reflect.*;
import java.util.*;

// Class Add to handle summing of numbers
class Add {
    /**
     * The add method uses variable arguments (varargs) to accept a flexible number
     * of integers.
     * It computes the sum of these integers and prints the result in the required
     * format.
     */
    void add(int... numbers) {
        int sum = 0; // Initialize the sum
        StringBuilder result = new StringBuilder(); // To build the formatted output

        // Loop through each number in the varargs
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add the current number to the sum
            result.append(numbers[i]); // Append the current number to the output string
            if (i < numbers.length - 1) { // Add "+" between numbers except after the last number
                result.append("+");
            }
        }

        result.append("=").append(sum); // Append "=" followed by the sum
        System.out.println(result.toString()); // Print the formatted output
    }
}

public class varargsAdd {
    public static void main(String[] args) {
        try {
            // BufferedReader for efficient input reading
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Prompt the user for inputs and read six integers
            System.out.println("Enter the first number:");
            int n1 = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number:");
            int n2 = Integer.parseInt(br.readLine());
            System.out.println("Enter the third number:");
            int n3 = Integer.parseInt(br.readLine());
            System.out.println("Enter the fourth number:");
            int n4 = Integer.parseInt(br.readLine());
            System.out.println("Enter the fifth number:");
            int n5 = Integer.parseInt(br.readLine());
            System.out.println("Enter the sixth number:");
            int n6 = Integer.parseInt(br.readLine());

            // Create an instance of Add
            Add ob = new Add();

            // Call the add method with varying numbers of arguments
            ob.add(n1, n2); // Adding 2 numbers
            ob.add(n1, n2, n3); // Adding 3 numbers
            ob.add(n1, n2, n3, n4, n5); // Adding 5 numbers
            ob.add(n1, n2, n3, n4, n5, n6); // Adding 6 numbers

            // Reflection to check for method overloading
            Method[] methods = Add.class.getDeclaredMethods(); // Get all declared methods in Add class
            Set<String> set = new HashSet<>(); // Set to store method names
            boolean overload = false; // Flag to check for overloading

            // Iterate through all methods
            for (Method method : methods) {
                if (set.contains(method.getName())) { // If the method name is already in the set
                    overload = true; // Overloading detected
                    break;
                }
                set.add(method.getName()); // Add the method name to the set
            }

            // If overloading is detected, throw an exception
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details
        }
    }
}
