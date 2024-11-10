import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BubbleSortExample {

    // Method to perform bubble sort, remove duplicates, and return a sorted array
    // without duplicates
    public static int[] bubbleSortAndRemoveDuplicates(int[] array) {
        // 1. Perform bubble sort on the input array
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // Compare adjacent elements
                    int temp = array[j]; // Swap if they are in the wrong order
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // If no swaps, the array is already sorted
        }

        // 2. Use HashSet to remove duplicates from the sorted array
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num); // Add elements to the HashSet, automatically removing duplicates
        }

        // 3. Convert HashSet back to List and then to an array
        List<Integer> uniqueList = new ArrayList<>(uniqueSet); // Convert HashSet to List for ordering
        uniqueList.sort(null); // Sort to maintain the order after removing duplicates

        // 4. Convert the unique sorted List back to an array
        int[] resultArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            resultArray[i] = uniqueList.get(i);
        }

        return resultArray; // Return the sorted array without duplicates
    }

    public static void main(String[] args) {
        // Original array with duplicates
        int[] originalArray = { 5, 2, 9, 1, 5, 6, 2, 4, 9 };

        // Print the original array
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the bubbleSortAndRemoveDuplicates method
        int[] sortedUniqueArray = bubbleSortAndRemoveDuplicates(originalArray);

        // Print the sorted array without duplicates
        System.out.print("Sorted Array without duplicates: ");
        for (int num : sortedUniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
