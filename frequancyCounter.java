public class frequancyCounter {

    /**
     * Counts and prints the frequency of each unique element in the array.
     *
     * @param arr the input array of integers
     */
    public static void countElementFrequencies(int[] arr) {
        int[] counted = new int[arr.length]; // Array to track counted elements
        int index = 0; // Tracks the number of unique elements in the counted array

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Check if the current element has already been counted
            if (!isCounted(arr[i], counted, index)) {
                // Count the occurrences of the current element in the array
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                // Add the element to the counted array
                counted[index] = arr[i];
                index++;

                // Print the frequency of the element
                System.out.println(arr[i] + ": " + count);
            }
        }
    }

    /**
     * Checks if a number has already been counted.
     *
     * @param num     the number to check
     * @param counted the array of counted elements
     * @param size    the current size of the counted array
     * @return true if the number has been counted, false otherwise
     */
    public static boolean isCounted(int num, int[] counted, int size) {
        for (int i = 0; i < size; i++) {
            if (counted[i] == num) {
                return true; // The number is already in the counted array
            }
        }
        return false; // The number has not been counted yet
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 2, 3, 7, 7, 5 }; // Example input array

        // Call the method to count and print frequencies
        countElementFrequencies(arr);
    }
}
