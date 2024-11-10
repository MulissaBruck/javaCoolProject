public class FrequencyCheck {
    public static int isFrequencyValid(int[] arr) {
        // Create an array to count occurrences, assuming the maximum value is less than
        // or equal to the length of the array
        int[] frequency = new int[arr.length + 1]; // Extra space for zero indexing

        // Count the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < frequency.length) { // Ensure the value is within the array bounds
                frequency[arr[i]]++;
            }
        }

        // Check the frequencies against their values
        for (int i = 1; i < frequency.length; i++) { // Start from 1 since we are interested in positive values
            if (frequency[i] >= i) { // If frequency is greater than or equal to the value
                return 0; // Invalid case
            }
        }

        return 1; // All frequencies are valid
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 2, 3 }; // Example input array
        int result = isFrequencyValid(arr);

        // Print the result
        if (result == 0) {
            System.out.println("Invalid frequency detected.");
        } else {
            System.out.println("All frequencies are valid.");
        }
    }
}
