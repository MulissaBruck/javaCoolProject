import java.util.Arrays;

public class PermutationsRecursive {

    // Method to generate all permutations recursively
    public static void generatePermutations(int[] arr) {
        // Start the permutation process from index 0
        permute(arr, 0);
    }

    // Helper method to recursively generate permutations
    private static void permute(int[] arr, int start) {
        // Base case: If start equals the length of the array, print the current
        // permutation
        if (start == arr.length) {
            System.out.println(Arrays.toString(arr)); // Print current permutation
            return;
        }

        // Recursive case: Try to fix each element at the current start position
        for (int i = start; i < arr.length; i++) {
            // Swap the element at start with the element at i
            swap(arr, start, i);

            // Recurse by fixing the next element at the next position (start + 1)
            permute(arr, start + 1);

            // Backtrack: Swap the elements back to their original position
            swap(arr, start, i);
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the permutation generator
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // Example array
        generatePermutations(arr); // Generate and print all permutations
    }
}
