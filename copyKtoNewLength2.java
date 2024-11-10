import java.util.Arrays;

public class copyKtoNewLength2 {

    public static int[] copyKtoNewLength(int[] a, int newLength, int k) {
        int[] newArray = new int[newLength]; // New array with the desired length

        int count = 0; // Keeps track of the total elements copied
        int length = a.length; // Length of the original array

        // Keep copying elements until the new array is filled
        while (count < newLength) {
            for (int i = 0; i < k && count < newLength; i++) {
                newArray[count] = a[i % length]; // Use modulo to wrap around
                count++;
            }
        }
        return newArray; // Return the new array
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 }; // Original array with only 2 elements
        int newLength = 4; // Desired length of the new array
        int k = 3; // Number of elements to copy

        // Call the function and print the new array
        int[] newArray = copyKtoNewLength(arr, newLength, k);
        System.out.println("New array: " + Arrays.toString(newArray)); // Output: [1, 2, 1, 2]
    }
}
