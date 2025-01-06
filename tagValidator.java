import java.io.*;
import java.util.*;
import java.util.regex.*;

public class tagValidator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Initialize scanner to read input
        int testCases = Integer.parseInt(in.nextLine()); // Read the number of test cases

        // Process each test case
        while (testCases > 0) {
            String line = in.nextLine(); // Read a line of text

            // Regular expression to find valid tags and their content
            // <([a-zA-Z][^<>]*)> - Matches an opening tag and captures the tag name
            // ([^<>]+) - Matches the content inside the tags (no nested tags)
            // </\\1> - Matches the closing tag, ensuring it matches the opening tag
            String regex = "<([a-zA-Z][^<>]*)>([^<>]+)</\\1>";
            Pattern pattern = Pattern.compile(regex); // Compile the regex pattern
            Matcher matcher = pattern.matcher(line); // Create a matcher for the current line

            boolean found = false; // Flag to track if valid content is found

            // Find all matches in the line
            while (matcher.find()) {
                // Print the content between the tags
                System.out.println(matcher.group(2));
                found = true; // Mark that at least one valid match was found
            }

            // If no valid content is found, print "None"
            if (!found) {
                System.out.println("None");
            }

            testCases--; // Decrement the number of remaining test cases
        }

        in.close(); // Close the scanner to release resources
    }
}
