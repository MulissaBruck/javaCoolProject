
// Java Program to Sort the Elements in
// Descending Order by Sorting and Reversing
import java.util.Arrays; // Importing the Arrays class for utility methods

class ArrayReverse {

    public static void main(String[] args) {
        // Initialize an array with elements
        int a[] = { 1, 2, 3, 4, 5 };

        // Sort the array in ascending order
        Arrays.sort(a);

        // Reverse the array to get descending order
        reverse(a);

        // Print the reversed (descending) array
        System.out.println(Arrays.toString(a));
    }

    // Method to reverse the array elements
    public static void reverse(int[] a) {
        // Get the length of the array
        int n = a.length;

        // Swap the first half of the array with the second half
        for (int i = 0; i < n / 2; i++) {
            // Temporarily store the current element
            int t = a[i];

            // Swap the current element with its corresponding element
            // from the end of the array
            a[i] = a[n - i - 1];

            // Place the stored element at the end position
            a[n - i - 1] = t;
        }
    }
}
