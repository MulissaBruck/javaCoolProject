// Java program to insert a string into another string
// using StringBuffer's insert() method

class stringInsert3 {

    // Function to insert a string at a specific index
    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index) {
        // Create a new StringBuffer object initialized with the original string
        StringBuffer newString = new StringBuffer(originalString);

        // Use the insert() method of StringBuffer to insert the stringToBeInserted
        // at the specified index + 1
        newString.insert(index + 1, stringToBeInserted);

        // Convert StringBuffer back to a String and return it
        return newString.toString();
    }

    // Driver code to test the function
    public static void main(String[] args) {

        // Original string and the string to be inserted
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        // Display the input strings and index
        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);

        // Call the insertString function and display the result
        System.out.println("Modified String: " +
                insertString(originalString, stringToBeInserted, index));
    }
}
