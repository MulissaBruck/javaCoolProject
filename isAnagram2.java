import java.util.*;

public class isAnagram2 {

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

        // Convert string 'a' to a character array
        char[] charsA = a.toCharArray();

        // Iterate over each character in the array of string 'a'
        for (int i = 0; i < charsA.length; i++) {
            // Get the current character at index 'i' in the array
            char c = charsA[i];

            // Calculate the index of the character 'c' in the alphabet (0 for 'a', 1 for
            // 'b', ..., 25 for 'z')
            int index = c - 'a';

            // Increment the frequency of the character 'c' in the countA array
            countA[index]++;
        }

        // Convert string 'b' to a character array
        char[] charsB = b.toCharArray();

        // Iterate over each character in the array of string 'b'
        for (int i = 0; i < charsB.length; i++) {
            // Get the current character at index 'i' in the array
            char c = charsB[i];

            // Calculate the index of the character 'c' in the alphabet (0 for 'a', 1 for
            // 'b', ..., 25 for 'z')
            int index = c - 'a';

            // Increment the frequency of the character 'c' in the countB array
            countB[index]++;
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
        // If ret is true, print "Anagrams"; otherwise, print "Not Anagrams"
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
