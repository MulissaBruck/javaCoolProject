import java.util.*; // Importing utility classes like Scanner and Arrays

public class AnagramChecker2 {

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String a, String b) {

        // Convert both strings to lowercase to ensure the comparison is
        // case-insensitive
        a = a.toLowerCase(); // Convert string 'a' to lowercase
        b = b.toLowerCase(); // Convert string 'b' to lowercase

        // If the lengths of the strings are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false; // If lengths are different, return false (not anagrams)
        }

        // Initialize two arrays to count the occurrences of each character for both
        // strings
        // Each array has 26 elements, one for each letter in the alphabet
        int[] countA = new int[26]; // Array to store frequency of characters in string 'a'
        int[] countB = new int[26]; // Array to store frequency of characters in string 'b'

        // Iterate over each character in string 'a' and update its frequency in
        // 'countA' array
        for (char c : a.toCharArray()) { // Iterate through the characters in string 'a'
            countA[c - 'a']++; // Increment the count for the character 'c' in the 'countA' array
        }

        // Iterate over each character in string 'b' and update its frequency in
        // 'countB' array
        for (char c : b.toCharArray()) { // Iterate through the characters in string 'b'
            countB[c - 'a']++; // Increment the count for the character 'c' in the 'countB' array
        }

        // Compare the frequency arrays for both strings to see if they match
        // If the frequencies of characters in both strings match, they are anagrams
        return Arrays.equals(countA, countB); // Return true if both arrays are equal
    }

    // Main method to test the anagram function
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Read the first string from user input
        String a = scan.next(); // Read a word (string) from the user and store it in 'a'

        // Read the second string from user input
        String b = scan.next(); // Read another word (string) from the user and store it in 'b'

        // Close the scanner object to prevent resource leak (i.e., system resources
        // used for reading input)
        scan.close();

        // Call the isAnagram function and store the result (true or false) in a
        // variable 'ret'
        boolean ret = isAnagram(a, b);

        // Print the result based on the boolean value of 'ret'
        // If 'ret' is true, print "Anagrams", otherwise print "Not Anagrams"
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
