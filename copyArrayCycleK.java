import java.util.Arrays;

public class copyArrayCycleK {
    public static int[] copyKtoNewLength(int[] arr, int lengOut, int k) {
        // Validate input
        if (arr == null || lengOut < 1 || k < 1 || k > arr.length) {
            return null; // Invalid input
        }

        int[] desiredOut = new int[lengOut]; // Array to store the result
        int count = 0; // Counter to cycle through the first `k` elements

        for (int i = 0; i < lengOut; i++) {
            desiredOut[i] = arr[count++]; // Copy element
            if (count == k) { // Reset counter if it reaches `k`
                count = 0;
            }
        }

        return desiredOut;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9, 16, 17, 3 }; // Original array
        int lengthOut = 10; // Desired length of the new array
        int Ks = 4; // Number of elements to copy in each cycle

        // Call the function and print the new array
        int[] newArray = copyKtoNewLength(arr, lengthOut, Ks);
        if (newArray != null) {
            System.out.println("New array: " + Arrays.toString(newArray));
            // Example output: [1, 2, 5, 9, 1, 2, 5, 9, 1, 2]
        } else {
            System.out.println("Invalid input.");
        }
    }
}
