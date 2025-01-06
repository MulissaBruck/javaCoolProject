
import java.io.*;

class ArrayRotate2 {

    // Function to rotate array
    static void Rotate(int arr[], int d, int n) {
        // Create a temporary array to store the rotated version of the array
        int temp[] = new int[n];

        // Variable to keep track of the index in temp[] array
        int k = 0;

        // Copy the elements from index 'd' to 'n-1' of arr[] to the beginning of temp[]
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++; // Increment the index in temp[]
        }

        // Copy the first 'd' elements of arr[] into the remaining positions of temp[]
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++; // Increment the index in temp[]
        }

        // Copy the elements from temp[] back into arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to print elements of the array
    static void PrintTheArray(int arr[], int n) {
        // Print all elements of arr[] from index 0 to n-1
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a newline after the array
    }

    // Main Method to test the rotation function
    public static void main(String[] args) {
        // Original array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        // Length of the array
        int N = arr.length;

        // Number of positions to rotate the array by
        int d = 2;

        // Call the Rotate function to rotate the array
        Rotate(arr, d, N);

        // Call PrintTheArray function to print the rotated array
        PrintTheArray(arr, N);
    }
}
