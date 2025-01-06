

import java.util.Arrays;

class stringEasySort {
    public static void main(String[] args) {
        // Input string
        String input = "geeksforgeeks";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert sorted char array back to string
        String sortedString = new String(charArray);

        // Print the original and sorted strings
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
