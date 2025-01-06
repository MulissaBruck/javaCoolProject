
// Importing required classes
import java.util.Arrays;
import java.util.List;

class stringRemoveZero1 {
    public static void main(String[] args) {
        // Sample string input
        String str = "00000123569";

        // Initialize a new string to store the result
        String newstr = "";

        // Variable to store the index of the first non-zero character
        int ind = 0;

        // Loop through the string to find the first non-zero character
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i); // Extract the character at position i
            if (p != '0') { // Check if the character is not a zero
                ind = i; // Store the index of the first non-zero character
                break; // Exit the loop once the first non-zero character is found
            }
        }

        // Create a substring starting from the first non-zero index to the end of the
        // string
        newstr = str.substring(ind, str.length());

        // Print the resulting string after removing leading zeros
        System.out.println(newstr);
    }
}
