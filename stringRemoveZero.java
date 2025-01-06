
// Java program to remove leading zeros from a given string

// Main class
class stringRemoveZero {

    // Method to remove leading zeros from a string
    public static String removeZero(String str) {
        // Initialize a counter for leading zeros
        int i = 0;

        // Traverse the string and count the number of leading zeros
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }

        // Convert the string into a StringBuffer (mutable version of String)
        StringBuffer sb = new StringBuffer(str);

        // Use the StringBuffer `replace` method to remove leading zeros
        // Replace characters from index 0 to `i` (exclusive) with an empty string
        sb.replace(0, i, "");

        // Return the resulting string
        return sb.toString();
    }

    // Main driver method
    public static void main(String[] args) {
        // Input string with leading zeros
        String str = "00000123569";

        // Call the method to remove leading zeros
        str = removeZero(str);

        // Print the string after removing leading zeros
        System.out.println(str); // Output: "123569"
    }
}
