// Java program to Compare two strings 
// lexicographically without using library functions
class stringLexicComparison {

    // Method to compare two strings lexicographically
    public static int stringCompare(String str1, String str2) {
        // Loop through both strings till the smaller string length
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            // Compare characters at the same position in both strings
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                // If characters are equal, continue to the next character
                continue;
            } else {
                // Return the difference of the two characters
                return (int) str1.charAt(i) - (int) str2.charAt(i);
            }
        }

        // Edge case: if one string is a prefix of the other
        if (str1.length() < str2.length()) {
            // Return the difference in lengths (negative if str1 is shorter)
            return str1.length() - str2.length();
        } else if (str1.length() > str2.length()) {
            // Return the difference in lengths (positive if str1 is longer)
            return str1.length() - str2.length();
        } else {
            // If both strings are of the same length and characters match
            return 0;
        }
    }

    // Driver function to test the above program
    public static void main(String args[]) {
        // Test strings for comparison
        String string1 = new String("Geeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeksforgeeks");

        // Compare strings and print results
        System.out.println("Comparison of 'Geeks' and 'Practice': " + stringCompare(string1, string2)); // Negative
                                                                                                        // result
        System.out.println("Comparison of 'Geeks' and 'Geeks': " + stringCompare(string1, string3)); // 0 (equal)
        System.out.println("Comparison of 'Practice' and 'Geeks': " + stringCompare(string2, string1)); // Positive
                                                                                                        // result

        // Edge case: comparing strings of different lengths
        System.out.println("Comparison of 'Geeks' and 'Geeksforgeeks': " + stringCompare(string1, string4)); // Negative
        System.out.println("Comparison of 'Geeksforgeeks' and 'Geeks': " + stringCompare(string4, string1)); // Positive
    }
}
