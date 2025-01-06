
public class stringPasswordValidator {

    // Function to check if the password contains certain characters
    public static void validatePassword(String password) {
        // Convert the password to lowercase for case-insensitive checking
        String lowerPassword = password.toLowerCase();

        // Define the required characters
        char[] requiredChars = { 'a', 'z', '1', '@' };

        // Flags to track whether each method works correctly
        boolean allPresentValueOf = true;
        boolean allPresentToString = true;

        // Check using String.valueOf()
        for (char ch : requiredChars) {
            if (!lowerPassword.contains(String.valueOf(ch))) {
                allPresentValueOf = false;
                break;
            }
        }

        // Check using Character.toString()
        for (char ch : requiredChars) {
            if (!lowerPassword.contains(Character.toString(ch))) {
                allPresentToString = false;
                break;
            }
        }

        // Display results
        System.out.println("Password: " + password);
        System.out.println("Validation using String.valueOf: "
                + (allPresentValueOf ? "All characters present" : "Missing required characters"));
        System.out.println("Validation using Character.toString: "
                + (allPresentToString ? "All characters present" : "Missing required characters"));
    }

    // Main function
    public static void main(String[] args) {
        // Example passwords to test
        String password1 = "Az1@StrongPass";
        String password2 = "WeakPassword";

        // Validate passwords
        validatePassword(password1);
        validatePassword(password2);
    }
}
