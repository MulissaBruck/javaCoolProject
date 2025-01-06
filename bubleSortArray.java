public class bubleSortArray {

    // Method to perform bubble sort on an array
    public static void bubbleSortArray(int[] array) {
        int n = array.length; // Get the length of the array
        boolean swapped; // Flag to track whether a swap occurred in a pass

        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swapped flag for this pass

            // Inner loop compares adjacent elements and swaps them if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // If current element is greater than the next one
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no elements were swapped during this pass, the array is already sorted
            if (!swapped)
                break;
        }
    }

    // Main method to test the bubbleSortArray function
    public static void main(String[] args) {
        // Create and initialize an array with some integers
        int[] numberArray = { 5, 2, 9, 1, 5, 6, 2 };

        // Print the original array
        System.out.print("Original Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the bubbleSortArray method to sort the array
        bubbleSortArray(numberArray);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
