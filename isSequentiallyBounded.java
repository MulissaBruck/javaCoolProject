public class isSequentiallyBounded {

    // Main method to check if the array is sequentially bounded
    public static int isSequentiallyBounded(int[] arr) {
        if (isStrictlyAscending(arr) == 1 && isFrequencyValid(arr) == 1) {
            return 1; // Valid array
        }
        return 0; // Invalid array
    }

    // Method to check if the array is strictly ascending
    public static int isStrictlyAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) { // Not strictly ascending
                return 0;
            }
        }
        return 1; // Strictly ascending
    }

    // Method to check if the frequency of each element is valid
    public static int isFrequencyValid(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= arr[i]) { // Frequency condition violated
                System.out.println("Frequency count: " + count + " for value: " + arr[i]);
                return 0;
            }
        }
        return 1; // Frequency is valid
    }

    // Main driver function
    public static void main(String[] args) {
        int[] array1 = { 3, 4, 5 }; // Example of a valid array
        int[] array2 = { 3, 4, 5, 5 }; // Example of an invalid array due to frequency
        int[] array3 = { 5, 5, 5 }; // Example of an invalid array due to frequency and order

        // Check each array and print the results
        System.out.println("Array 1 valid: " + (isSequentiallyBounded(array1) == 1)); // Should print true
        System.out.println("Array 2 valid: " + (isSequentiallyBounded(array2) == 1)); // Should print false
        System.out.println("Array 3 valid: " + (isSequentiallyBounded(array3) == 1)); // Should print false
    }
}
