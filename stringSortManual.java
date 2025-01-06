
class stringSortManual {
    public static void main(String[] args) {
        // Input string
        String input = "geeksforgeeks";

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Bubble sort logic to sort the character array
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap the characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        // Print the original and sorted strings
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
