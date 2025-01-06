import java.io.*;
import java.util.*;

public class isToken4 {

    public static void main(String[] args) {
        // Create scanner to read input
        Scanner scan = new Scanner(System.in);

        // Read the input string
        String s = scan.nextLine();

        // Close the scanner
        scan.close();

        // Initialize a StringBuilder to store the current token
        StringBuilder token = new StringBuilder();

        // Initialize a counter to keep track of the number of tokens
        int tokenCount = 0;

        // First, count the number of tokens
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an alphabetic letter, append it to the current token
            if (Character.isAlphabetic(c)) {
                token.append(c);
            } else {
                // If we encounter a non-alphabetic character and the token is not empty,
                // increment count
                if (token.length() > 0) {
                    tokenCount++; // Increment the token count
                    token.setLength(0); // Reset the token for the next one
                }
            }
        }

        // If there is any token left, increment the token count
        if (token.length() > 0) {
            tokenCount++;
        }

        // Now print the total number of tokens
        System.out.println(tokenCount);

        // Reset token variable for the second pass to print individual tokens
        token.setLength(0);

        // Iterate again to print each token
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an alphabetic letter, append it to the current token
            if (Character.isAlphabetic(c)) {
                token.append(c);
            } else {
                // If we encounter a non-alphabetic character and the token is not empty, print
                // it
                if (token.length() > 0) {
                    System.out.println(token.toString());
                    token.setLength(0); // Reset the token for the next one
                }
            }
        }

        // If there is any token left, print it
        if (token.length() > 0) {
            System.out.println(token.toString());
        }
    }
}
