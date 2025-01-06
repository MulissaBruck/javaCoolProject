import java.util.Scanner;
import java.util.regex.*;

public class userNameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines to process
        int n = Integer.parseInt(scanner.nextLine());

        // Regular expression to match valid tags and their content
        // <([a-zA-Z][^<>]*)> - Matches the opening tag and captures the tag name
        // ([^<>]+) - Matches the content inside the tags (excluding nested tags)
        // </\\1> - Matches the closing tag, ensuring it matches the opening tag
        String regex = "<([a-zA-Z][^<>]*)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex); // Compile the regex pattern

        // Loop through each line of input
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // Read a line of input
            Matcher matcher = pattern.matcher(line); // Match the regex against the line
            boolean found = false; // Flag to track if valid content is found

            // Find all matches in the current line
            while (matcher.find()) {
                // Print the content captured inside valid tags
                System.out.println(matcher.group(2));
                found = true; // Mark that at least one valid match was found
            }

            // If no valid content was found in this line, print "None"
            if (!found) {
                System.out.println("None");
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
