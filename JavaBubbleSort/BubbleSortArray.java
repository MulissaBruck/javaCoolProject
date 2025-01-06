package JavaBubbleSort;

public class BubbleSortArray {

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
                    int temp = array[j]; // Swap the elements
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }
            if (!swapped)
                break; // If no swaps, the array is already sorted, exit early
        }
    }

    // Method to print the array elements
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " "); // Print each number in the array
        }
        System.out.println();
    }
}
