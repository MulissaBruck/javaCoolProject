import java.util.Scanner;

public class isToken {
    public static void main(String[] args) {
        // Create scanner to read input
        Scanner scan = new Scanner(System.in);

        // Read the entire line of input as a string
        String input = scan.nextLine();

        // Close the scanner
        scan.close();

        // Use regular expression to split the string based on non-alphabetic characters
        String[] tokens = input.split("[^A-Za-z]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            if (!token.isEmpty()) { // Check to avoid printing empty strings
                System.out.println(token);
            }
        }
    }
}
