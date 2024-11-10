public class frequencyCounter {

    public static void countElementFrequencies(int[] arr) {
        // Array to hold the frequency count of each unique element
        int[] frequencies = new int[arr.length];
        int uniqueCount = 0; // To track the number of unique elements

        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Reset count for each element
            boolean alreadyCounted = false; // Flag to avoid counting duplicates

            // Check if the element has already been counted
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true; // Mark if the current element has already been counted
                    break;
                }
            }

            // Only count if it's not already counted
            if (!alreadyCounted) {
                // Count occurrences of arr[i]
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                // Store the unique element and its frequency
                frequencies[uniqueCount] = count;
                uniqueCount++; // Increment the count of unique elements
            }
        }

        // Print the frequencies of unique elements
        System.out.println("Frequencies:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(arr[i] + ": " + frequencies[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 2, 3 }; // Example input array
        countElementFrequencies(arr);
    }
}
