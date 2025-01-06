import java.io.*;
import java.util.*;

public class isToken6 {

    public static void main(String[] args) {
        // Create scanner to read input
        Scanner scan = new Scanner(System.in);

        // Read the input string
        String s = scan.nextLine();

        // Close the scanner
        scan.close();

        // Initialize a StringBuilder to store the current token
        StringBuilder token = new StringBuilder();

        // Initialize a list to store the tokens
        List<String> tokens = new ArrayList<>();

        // Expanded for loop to process the string
        int i = 0; // Start at the beginning of the string
        while (i < s.length()) { // Continue until the end of the string
            char c = s.charAt(i); // Get the character at position i

            if (Character.isAlphabetic(c)) {
                // If the character is alphabetic, append it to the current token
                token.append(c);
            } else {
                // If it's a non-alphabetic character, check if the token is not empty
                if (token.length() > 0) {
                    tokens.add(token.toString()); // Add the token to the list
                    token.setLength(0); // Reset the token
                }
            }
            i++; // Move to the next character
        }

        // After the loop, check if there's a leftover token
        if (token.length() > 0) {
            tokens.add(token.toString()); // Add the last token
        }

        // Print the total number of tokens first
        System.out.println(tokens.size());

        // Print each token on a new line
        for (int j = 0; j < tokens.size(); j++) {
            System.out.println(tokens.get(j)); // Print the token at index j
        }
    }
}
