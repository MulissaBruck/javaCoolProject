import java.util.*; // Import utility classes like Scanner
import java.security.*; // Import classes related to security

public class IntegertoString {
    public static void main(String[] args) {

        // Prevent termination of the program using System.exit(0)
        DoNotTerminate.forbidExit();

        try {
            // Create a Scanner object to read input from the user
            Scanner in = new Scanner(System.in);

            // Read the integer input
            int n = in.nextInt();

            // Close the scanner to free resources
            in.close();

            // Convert the integer to a string
            String s = Integer.toString(n); // Conversion of int to String

            // Check if the conversion was successful by comparing values
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job"); // Print success message if they match
            } else {
                System.out.println("Wrong answer."); // Print failure message otherwise
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            // This block will handle the custom exception thrown if System.exit(0) is
            // called
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class ensures the program cannot be terminated using
// System.exit(0)
class DoNotTerminate {

    // A custom exception to signal that the program tried to exit
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1; // Serialization ID
    }

    // This method installs a custom security manager to forbid System.exit calls
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                // If the permission involves exiting the JVM, throw the custom exception
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        // Set the custom security manager
        System.setSecurityManager(securityManager);
    }
}
