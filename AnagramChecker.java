import java.util.*;

public class AnagramChecker {

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String a, String b) {
        // Normalize both strings to lowercase to ignore case
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If the lengths of the strings are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false; // Not anagrams
        }

        // Initialize frequency arrays to count occurrences of each character (26
        // letters of the alphabet)
        int[] countA = new int[26];
        int[] countB = new int[26];

        // Iterate over each character in string 'a' and update frequency in countA
        // array
        for (char c : a.toCharArray()) {
            countA[c - 'a']++; // Increment the count for the character 'c'
        }

        // Iterate over each character in string 'b' and update frequency in countB
        // array
        for (char c : b.toCharArray()) {
            countB[c - 'a']++; // Increment the count for the character 'c'
        }

        // Compare the frequency arrays of both strings to see if they match
        return Arrays.equals(countA, countB); // If frequencies match, the strings are anagrams
    }

    // Main method to test the anagram function
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Read the first string from user input
        String a = scan.next();

        // Read the second string from user input
        String b = scan.next();

        // Close the scanner object to prevent resource leak
        scan.close();

        // Call the isAnagram function and store the result (true or false)
        boolean ret = isAnagram(a, b);

        // Print the result based on the boolean value of ret
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
