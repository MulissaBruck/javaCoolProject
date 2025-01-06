package JavaBubbleListSort;

import java.util.List;

public class BubbleSortArray {

    // Method to perform bubble sort on an ArrayList
    public static void bubbleSortList(List<Integer> list) {
        int n = list.size(); // Get the size of the ArrayList
        boolean swapped; // Flag to track whether a swap occurred in a pass

        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swapped flag for this pass

            // Inner loop compares adjacent elements and swaps them if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) { // If current element is greater than the next one
                    // Swap the elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no elements were swapped during this pass, the list is already sorted
            if (!swapped)
                break;
        }
    }
}
