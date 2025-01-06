
// Java Program to demonstrate working of binarySearch()
// Method of Arrays class in a sorted array

import java.util.Arrays; // Import the Arrays class for utility methods

public class binarySearchBuiltMthd {

    public static void main(String[] args) {
        // Initialize an unsorted array
        int a[] = { 10, 20, 15, 22, 35 };

        // Sort the array using Arrays.sort() method
        // Binary search requires the array to be sorted
        Arrays.sort(a);

        // Element to search for
        int x = 22;

        // Perform binary search for 'x' in the sorted array
        int res = Arrays.binarySearch(a, x);

        // Check the result of the search
        if (res >= 0) // If the result is non-negative, element is found
            System.out.println(x + " found at index = " + res);
        else // If result is negative, element is not found
            System.out.println(x + " Not found");

        // Search for another element '40' that is not in the array
        x = 40;
        res = Arrays.binarySearch(a, x);

        // Check the result of the second search
        if (res >= 0)
            System.out.println(x + " found at index = " + res);
        else
            System.out.println(x + " Not found");
    }
}
