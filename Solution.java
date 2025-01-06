import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine()); // Read the number of sentences

        while (numSentences-- > 0) {
            String input = in.nextLine(); // Read each sentence

            // Step 1: Write a RegEx that will match any repeated word
            String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)"; // Match repeated words

            // Step 2: Compile the regex argument with case-insensitivity
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            // Step 3: Use replaceAll to retain only the first occurrence of repeated words
            Matcher matcher = pattern.matcher(input); // Apply regex to input
            String result = matcher.replaceAll("$1"); // Replace with the first occurrence of the word

            System.out.println(result); // Print the modified sentence
        }

        in.close(); // Close the scanner
    }
}
