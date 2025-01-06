import java.util.*;

public class isAnagram3 {

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

        // Convert string 'a' to a character array and count frequencies
        char[] charsA = a.toCharArray();
        for (int i = 0; i < charsA.length; i++) {
            char c = charsA[i];
            int index = c - 'a'; // Get index for the character 'c'
            countA[index]++; // Increment frequency for character 'c'
        }

        // Convert string 'b' to a character array and count frequencies
        char[] charsB = b.toCharArray();
        for (int i = 0; i < charsB.length; i++) {
            char c = charsB[i];
            int index = c - 'a'; // Get index for the character 'c'
            countB[index]++; // Increment frequency for character 'c'
        }

        // Compare the two frequency arrays manually
        for (int i = 0; i < 26; i++) {
            if (countA[i] != countB[i]) {
                return false; // If any character frequency is different, return false
            }
        }

        return true; // All frequencies match, return true (anagrams)
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
        // If ret is true, print "Anagrams"; otherwise, print "Not Anagrams"
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
