import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class isRegEx {

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the leftover newline

        // Process each pattern
        for (int i = 0; i < testCases; i++) {
            String pattern = scanner.nextLine();

            try {
                // Try to compile the pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If an exception occurs, the pattern is invalid
                System.out.println("Invalid");
            }
        }

        scanner.close(); // Close the scanner
    }
}
