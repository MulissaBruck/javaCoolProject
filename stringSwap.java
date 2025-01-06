
class stringSwap {
    public static String swapPairs(String str) {
        // Convert the string to a character array for easy manipulation
        char[] charArray = str.toCharArray();

        // Iterate through the array, swapping every pair of characters
        for (int i = 0; i < charArray.length - 1; i += 2) {
            // Swap the current character with the next one
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "Java";
        String input2 = "GeeksForGeeks";

        System.out.println("Original: " + input1 + " -> Swapped: " + swapPairs(input1));
        System.out.println("Original: " + input2 + " -> Swapped: " + swapPairs(input2));
    }
}
