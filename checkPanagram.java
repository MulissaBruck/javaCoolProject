
import java.util.HashSet;

class checkPanagram {
    public static String containsAllLetters(String str) {
        // Convert the string to lowercase to ignore case
        str = str.toLowerCase();

        // Create a set to store unique letters
        HashSet<Character> letters = new HashSet<>();

        // Iterate through the string
        for (char ch : str.toCharArray()) {
            // Add the character to the set if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        // Check if the set contains all 26 letters
        return letters.size() == 26 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "Abcdefghijklmnopqrstuvwxyz";
        String input2 = "GeeksForGeeks";

        System.out.println("Input: " + input1 + " -> Output: " + containsAllLetters(input1));
        System.out.println("Input: " + input2 + " -> Output: " + containsAllLetters(input2));
    }
}
