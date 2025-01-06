// Java program for the above approach

class checkPanagram2 {

    // Function to check if a string
    // contains all the letters from
    // a to z (ignoring case)
    public static void allLetter(String str) {
        // Converting the given string
        // into lowercase
        str = str.toLowerCase();

        boolean allLetterPresent = true;

        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {

            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        // other way of doing it to check the str contains the char ch or not.
        // the mehtod are : String.ValueOf(ch) or charactor.toString(ch)
        /*
         * for (char ch = 'a'; ch <= 'z'; ch++) {
         * // Check if the current letter is missing in the string
         * if (!str.contains(Character.toString(ch))) {
         * allLetterPresent = false;
         * break; // Break the loop if any letter is missing
         * }
         * }
         */

        // Check if all letter present then
        // print "Yes", else print "No"
        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    // Driver Code
    public static void main(String args[]) {
        // Given string str
        String str = "Abcdefghijklmnopqrstuvwxyz12";

        // Function call
        allLetter(str);
    }
}
