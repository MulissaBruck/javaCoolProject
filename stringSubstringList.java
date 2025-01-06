import java.io.*;
import java.util.ArrayList;

class SubstringsOfAString {

    // Static method to split a string into all its substrings
    // and return them as an ArrayList
    public static ArrayList<String> splitSubstrings(String s) {

        // List object to store all substrings
        ArrayList<String> subStringList = new ArrayList<String>();

        // Variables to traverse through the string
        int stringLength = s.length();

        // Nested loop to generate all substrings
        for (int i = 0; i < stringLength; i++) {
            for (int j = i + 1; j <= stringLength; j++) {
                // Adding the substring from index i to j
                subStringList.add(s.substring(i, j));
            }
        }

        // Return the list of substrings
        return subStringList;
    }

    // Driver function to test the splitSubstrings method
    public static void main(String[] args) {

        // Input string
        String stringInput = "The Cat";

        // Calling the static method splitSubstrings using the class name
        ArrayList<String> subStringList = SubstringsOfAString.splitSubstrings(stringInput);

        // Printing the list of substrings
        System.out.println("\nSubstring list printed as an ArrayList : ");
        System.out.println(subStringList);

        // Printing all substrings one per line
        System.out.println("\n\nAll substrings printed 1 per line : ");
        int count = 1;
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it + "\"");
            count++;
        }
    }
}
