import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class bubleSortHashListArray {

    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // If the current element is greater than the next element
                    int temp = array[j]; // Swap elements
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // If no elements were swapped, the array is already sorted
        }
    }

    // Method to perform bubble sort on an ArrayList
    public static void bubbleSortList(List<Integer> list) {
        int n = list.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) { // If the current element is greater than the next element
                    // Swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped)
                break; // If no elements were swapped, the list is already sorted
        }
    }

    public static void main(String[] args) {
        // 1. Bubble sort on an array
        int[] numberArray = { 5, 2, 9, 1, 5, 6, 2 }; // Array with duplicates
        System.out.print("Original Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(numberArray); // Sort the array
        System.out.print("Sorted Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Bubble sort on an ArrayList (a type of List)
        List<Integer> numberList = new ArrayList<>();
        for (int num : numberArray) {
            numberList.add(num); // Add elements from array to ArrayList
        }
        System.out.println("Original ArrayList (with duplicates): " + numberList);

        bubbleSortList(numberList); // Sort the ArrayList
        System.out.println("Sorted ArrayList: " + numberList);

        // 3. Using a HashSet to remove duplicates
        HashSet<Integer> numberSet = new HashSet<>(numberList); // Create a HashSet from the sorted list
        System.out.println("HashSet (no duplicates): " + numberSet);

        // 4. Convert HashSet back to ArrayList to maintain unique values as a sorted
        // List
        List<Integer> uniqueSortedList = new ArrayList<>(numberSet);
        bubbleSortList(uniqueSortedList); // Re-sort to maintain order after converting back
        System.out.println("Unique Sorted ArrayList: " + uniqueSortedList);
    }
}
