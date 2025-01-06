// Java program to insert a string into another string 
// without using any pre-defined method 

class stringInsert {

    // Function to insert a string into another string
    public static String insertString(
            String originalString, // The string where another string will be inserted
            String stringToBeInserted, // The string to insert
            int index) // The index at which to insert the string
    {
        // Create a new string to store the result
        String newString = "";

        // Traverse through the original string
        for (int i = 0; i < originalString.length(); i++) {
            // Append each character of the original string
            newString += originalString.charAt(i);

            // If the current index matches the insertion index
            if (i == index) {
                // Append the string to be inserted
                newString += stringToBeInserted;
            }
        }

        // Return the modified string
        return newString;
    }

    // Driver code
    public static void main(String[] args) {
        // Define the original string
        String originalString = "GeeksGeeks";

        // Define the string to be inserted
        String stringToBeInserted = "For";

        // Define the index at which to insert
        int index = 4;

        // Display the original string
        System.out.println("Original String: " + originalString);

        // Display the string to be inserted
        System.out.println("String to be inserted: " + stringToBeInserted);

        // Display the index for insertion
        System.out.println("String to be inserted at index: " + index);

        // Call the function to insert the string and display the result
        System.out.println("Modified String: "
                + insertString(originalString, stringToBeInserted, index));
    }
}
