public class FrequencyCheck {

    /**
     * Checks if the frequencies of elements in the array are valid based on a
     * specific condition.
     * A frequency is considered invalid if the frequency of any element is greater
     * than or equal to the element's value.
     * 
     * @param arr the input array of integers
     * @return 1 if all frequencies are valid, otherwise 0
     */
    public static int isFrequencyValid(int[] arr) {
        // Create an array to count occurrences, assuming the maximum value is less than
        // or equal to the length of the array
        int[] frequency = new int[arr.length + 1]; // Extra space for zero indexing

        // Count the frequency of each element in the input array
        for (int i = 0; i < arr.length; i++) { // Iterate through the input array
            if (arr[i] < frequency.length) { // Ensure the element is within the valid range for frequency array
                                             // indexing
                frequency[arr[i]]++; // Increment the frequency of the element arr[i]
            }
        }

        // Check if the frequency of any element violates the condition (i.e., frequency
        // >= element value)
        for (int i = 1; i < frequency.length; i++) { // Start from 1, since we're interested in positive values only
            if (frequency[i] >= i) { // If the frequency is greater than or equal to the element's value
                return 0; // Invalid case, return 0
            }
        }

        // If no violations, all frequencies are valid
        return 1; // All frequencies are valid
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = { 2, 3, 5, 6, 3 };

        // Call the isFrequencyValid function to check the validity of frequencies in
        // the array
        int result = isFrequencyValid(arr);

        // Print the result based on whether the frequencies are valid or not
        if (result == 0) {
            System.out.println("Invalid frequency detected.");
        } else {
            System.out.println("All frequencies are valid.");
        }
    }
}
