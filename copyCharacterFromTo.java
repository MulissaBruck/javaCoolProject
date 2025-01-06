public class copyCharacterFromTo {

    public static void copyCharacter(char[] array, int fromIndex, int toIndex) {
        // Check if the indices are within bounds
        if (fromIndex >= 0 && fromIndex < array.length && toIndex >= 0 && toIndex < array.length) {
            // Copy the character at 'fromIndex' and paste it at 'toIndex'
            array[toIndex] = array[fromIndex];
        } else {
            System.out.println("Invalid indices");
        }
    }

    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println(); // Print new line after array
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };

        // Print original array
        System.out.println("Original array:");
        printArray(arr);

        // Copy character from index 1 ('b') to index 3
        copyCharacter(arr, 1, 3);

        // Print array after copying
        System.out.println("Array after copying character from index 1 to index 3:");
        printArray(arr);

        // Copy character from index 0 ('a') to index 4
        copyCharacter(arr, 0, 4);

        // Print array after copying
        System.out.println("Array after copying character from index 0 to index 4:");
        printArray(arr);
    }
}
