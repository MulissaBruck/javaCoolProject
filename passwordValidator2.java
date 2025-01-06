import java.util.Scanner;

class UsernameValidator {
    // Regular expression to validate usernames
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class passwordValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password for authentication
        final String PASSWORD = "admin123";

        // Prompt the user for a password
        System.out.print("Enter the password to proceed: ");
        String inputPassword = scanner.nextLine();

        // Check if the entered password is correct
        if (!inputPassword.equals(PASSWORD)) {
            System.out.println("Access Denied! Incorrect Password.");
            return; // Exit the program if the password is incorrect
        }

        System.out.println("Access Granted! Proceed with username validation.");

        // Read and validate the number of usernames
        int n = 0;
        while (true) {
            System.out.print("Enter the number of usernames to validate: ");
            String input = scanner.nextLine();

            try {
                n = Integer.parseInt(input);
                if (n <= 0) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    break; // Exit the loop if the input is valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Iterate through each username and validate
        for (int i = 0; i < n; i++) {
            System.out.print("Enter username " + (i + 1) + ": ");
            String username = scanner.nextLine();

            // Validate the username using the regular expression
            if (username.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}
