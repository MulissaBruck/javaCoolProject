
import java.util.*; // Importing necessary utilities for Stack

class reversStringStack2 {

    // Function to reverse a string using a stack
    public static String ReverseString(String str) {
        // Create a character array to store the reversed string
        char[] reverseString = new char[str.length()];

        // Declare a stack of type Character
        Stack<Character> stack = new Stack<Character>();

        // Traverse the string and push each character onto the stack
        for (int i = 0; i < str.length(); i++) {
            // Push the current character into the stack
            stack.push(str.charAt(i));
        }

        // Pop characters from the stack to build the reversed string
        int i = 0;
        while (!stack.isEmpty()) {
            // Pop the top character from the stack and store it in the array
            reverseString[i++] = stack.pop();
        }

        // Convert the character array to a string and return it
        return new String(reverseString);
    }

    // Driver code to test the ReverseString function
    public static void main(String[] args) {
        // Test string 1
        String str1 = "GeeksForGeeks";

        // Call the reverse function and print the result
        System.out.println(str1 + " <- Reverse -> "
                + ReverseString(str1));

        // Test string 2
        String str2 = "Hello World";

        // Call the reverse function and print the result
        System.out.println(str2 + " <- Reverse -> "
                + ReverseString(str2));
    }
}
