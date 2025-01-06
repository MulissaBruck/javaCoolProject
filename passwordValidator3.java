import java.util.Scanner;

// Class to validate usernames based on the given constraints
class UsernameValidator {
    /*
     * Define the regular expression for username validation:
     * ^ - Matches the start of the string.
     * [a-zA-Z] - Ensures the first character is an alphabet (A-Z or a-z).
     * [a-zA-Z0-9_] - Allows alphanumeric characters (A-Z, a-z, 0-9) and underscore
     * (_) for the rest.
     * {7,29} - Ensures the username length (excluding the first character) is
     * between 7 and 29.
     * $ - Matches the end of the string.
     * 
     * This makes the total length of the username between 8 and 30 characters
     * inclusive.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

// Main class to handle input, validation, and output
public class passwordValidator3 {
    // Scanner object for reading input
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Read the number of usernames to validate
        int n = Integer.parseInt(scan.nextLine());

        // Loop to process each username
        while (n-- != 0) {
            // Read the username from input
            String userName = scan.nextLine();

            // Check if the username matches the regular expression
            if (userName.matches(UsernameValidator.regularExpression)) {
                // Print "Valid" if the username satisfies all constraints
                System.out.println("Valid");
            } else {
                // Print "Invalid" if the username does not satisfy the constraints
                System.out.println("Invalid");
            }
        }

        // Close the scanner to free resources
        scan.close();
    }
}
