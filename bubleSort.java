
// Java Program to Sort Elements of an Array in
// Ascending Order using manual bubble sort
import java.util.Arrays;

class bubleSort {

    // Length of the array
    static int l;

    // Method to sort the array in ascending order
    public static void sort(int[] a) {
        // Temporary variable for swapping elements
        int t = 0;

        // Outer loop to iterate through the array
        for (int i = 0; i < l; i++) {

            // Inner loop to compare and swap elements
            for (int j = i + 1; j < l; j++) {
                // If the current element is greater than the next element, swap them
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Initialize array to be sorted
        int[] a = new int[] { -2, 0, 1, 3, -1, 2 };

        // Set the length of the array
        l = a.length;

        // Call the sort method to sort the array
        sort(a);

        // Print the sorted array
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
