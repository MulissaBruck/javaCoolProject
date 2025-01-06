// Java program to insert a string into another string
// using the substring method
class stringInsert2 {

    // Function to insert a string at a specific index
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        // Use substring to split the original string and insert the new string
        String newString = originalString.substring(0, index + 1) // Get characters up to the index (inclusive)
                + stringToBeInserted // Insert the string to be added
                + originalString.substring(index + 1); // Append remaining characters

        // Return the modified string
        return newString;
    }

    // Driver code
    public static void main(String[] args) {

        // Original string and string to be inserted
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        // Display the inputs
        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);

        // Insert the string and display the result
        System.out.println("Modified String: " +
                insertString(originalString, stringToBeInserted, index));
    }
}
