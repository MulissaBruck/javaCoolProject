import java.io.*;
import java.util.*;

public class isToken5 {

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

        // Iterate through the string to split it into tokens
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an alphabetic letter, append it to the current token
            if (Character.isAlphabetic(c)) {
                token.append(c);
            } else {
                // If we encounter a non-alphabetic character and the token is not empty, save
                // it
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0); // Reset the token for the next one
                }
            }
        }

        // If there's any remaining token at the end, add it to the list
        if (token.length() > 0) {
            tokens.add(token.toString());
        }

        // Print the number of tokens first
        System.out.println(tokens.size());

        // Then, print each token in a new line
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}
