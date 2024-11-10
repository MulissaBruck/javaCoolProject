public class sumTest3DistinctElementsPointer {
    // Method to implement Bubble Sort
    public static void bubbleSort(int[] intArr) {
        int n = intArr.length;

        // Outer loop for each pass over the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for each pair of adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if out of order
                if (intArr[j] > intArr[j + 1]) {
                    // Swap elements
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
    }

    // Method to check if three distinct integers sum up to testInt using
    // two-pointer technique
    public static boolean testForSum(int[] intArr, int testInt) {
        // Sort the array using custom bubbleSort method
        bubbleSort(intArr);

        // Loop through the array, considering each element as the first number in the
        // triplet
        for (int i = 0; i < intArr.length - 2; i++) {
            // Initialize two pointers for the remaining part of the array
            int left = i + 1;
            int right = intArr.length - 1;

            // Use two pointers to find if a pair exists that sums up with intArr[i] to
            // testInt
            while (left < right) {
                int sum = intArr[i] + intArr[left] + intArr[right];

                if (sum == testInt) {
                    return true; // Found a triplet whose sum equals testInt
                } else if (sum < testInt) {
                    left++; // Increase the left pointer to make the sum larger
                } else {
                    right--; // Decrease the right pointer to make the sum smaller
                }
            }
        }
        return false; // No triplet found
    }

    // Main method to test the testForSum method
    public static void main(String[] args) {
        // Example test case
        int[] arr = { 5, 1, 23, 21, 17, 2, 3, 9, 12 };
        int testInt = 22;

        // Call the method and print the result
        boolean result = testForSum(arr, testInt);
        System.out.println("Test result: " + result); // Should output 'true' or 'false'
    }
}
