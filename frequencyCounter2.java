public class frequencyCounter2 {
    public static void countElementFrequencies(int[] arr) {
        // Array to store the unique elements
        int[] uniqueElements = new int[arr.length];
        int[] frequencies = new int[arr.length];
        int uniqueCount = 0; // To track the number of unique elements

        // Iterate over the original array to count frequencies
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Reset count for each element
            boolean alreadyCounted = false; // Flag to avoid counting duplicates

            // Check if the element has already been counted (by checking the uniqueElements
            // array)
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueElements[j]) {
                    alreadyCounted = true; // Mark if the current element has already been counted
                    break;
                }
            }

            // Only count if it's not already counted
            if (!alreadyCounted) {
                // Store the current element as a unique element
                uniqueElements[uniqueCount] = arr[i];

                // Count occurrences of arr[i] in the entire array
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                // Store the frequency of this unique element
                frequencies[uniqueCount] = count;
                uniqueCount++; // Increment the unique element count
            }
        }

        // Print the frequencies of unique elements
        System.out.println("Frequencies:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + ": " + frequencies[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 2, 3 }; // Example input array
        countElementFrequencies(arr);
    }
}
