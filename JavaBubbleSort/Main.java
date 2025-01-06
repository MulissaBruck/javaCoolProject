package JavaBubbleSort;

public class Main {

    public static void main(String[] args) {
        // Sample input array
        int[] numberArray = { 5, 2, 9, 1, 5, 6, 2 }; // Array with duplicates

        // Print the original array
        System.out.print("Original Array: ");
        BubbleSortArray.printArray(numberArray); // Call printArray from BubbleSortArray class

        // Call the bubbleSortArray method to sort the array
        BubbleSortArray.bubbleSortArray(numberArray); // Sort the array using bubble sort

        // Print the sorted array
        System.out.print("Sorted Array: ");
        BubbleSortArray.printArray(numberArray); // Print the sorted array
    }
}
