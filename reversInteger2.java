import java.util.*;

public class reversInteger2 {
    /**
     * Reverses the digits of an integer, preserving the sign.
     * 
     * @param n The integer to reverse.
     * @return The reversed integer.
     */
    public static int reverseInteger(int n) {
        // Convert the integer to a string for easy manipulation
        String numb = Integer.toString(n);
        String reverseNum = ""; // To hold the reversed number as a string

        // If the number is negative, handle the negative sign separately
        boolean isNegative = numb.charAt(0) == '-';

        // Determine the starting index for reversal
        int startIndex = isNegative ? 1 : 0;

        // Reverse the digits (skip the negative sign if present)
        for (int i = numb.length() - 1; i >= startIndex; i--) {
            reverseNum += numb.charAt(i);
        }

        // Convert the reversed string back to an integer
        int reversed = Integer.parseInt(reverseNum);

        // Restore the sign if the number was negative
        if (isNegative) {
            reversed = -reversed;
        }

        // Return the reversed integer
        return reversed;
    }

    public static void main(String[] args) {
        // Test cases to validate the function
        System.out.println(reverseInteger(-12345)); // Output: -54321
        System.out.println(reverseInteger(12005)); // Output: 50021
        System.out.println(reverseInteger(1)); // Output: 1
        System.out.println(reverseInteger(1000)); // Output: 1
        System.out.println(reverseInteger(0)); // Output: 0
        System.out.println(reverseInteger(-120)); // Output: -21
    }
}
