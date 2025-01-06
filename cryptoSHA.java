import java.security.MessageDigest;
import java.util.Scanner;

public class cryptoSHA {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to compute SHA-256 hash and print the result
        System.out.println(computeSHA256(input));
    }

    public static String computeSHA256(String input) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Perform the hash computation
            byte[] hashBytes = digest.digest(input.getBytes());

            // Convert byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            // Return the final hash string
            return hexString.toString();
        } catch (Exception e) {
            // Handle exceptions (e.g., if SHA-256 algorithm is not available)
            e.printStackTrace();
            return null;
        }
    }
}
