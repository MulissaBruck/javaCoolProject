public class PermutationsLexicographical {

    // Method to generate all lexicographical permutations of an array
    public static void generatePermutations(int[] arr) {
        // Sort the array using custom bubble sort to start with the smallest
        // lexicographical order
        bubbleSort(arr);

        // Print the initial (first) permutation
        System.out.println(arrayToString(arr));

        // Loop to generate and print each subsequent permutation
        while (nextPermutation(arr)) { // Continue while there is a "next" permutation
            System.out.println(arrayToString(arr));
        }
    }

    // Method to find the next lexicographical permutation
    public static boolean nextPermutation(int[] arr) {
        // Step 1: Find the largest index 'i' where arr[i] < arr[i + 1]
        // This marks the first pair of elements from the right in increasing order
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) { // Move leftwards if current element is not less than the next
            i--;
        }

        // If no such 'i' is found, the array is in descending order, and all
        // permutations have been generated
        if (i < 0) {
            return false;
        }

        // Step 2: Find the largest index 'j' such that arr[j] > arr[i]
        // This 'j' will be the smallest element greater than arr[i] on the right side
        // of 'i'
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) { // Find the first element from the right that is greater than arr[i]
            j--;
        }

        // Step 3: Swap arr[i] and arr[j] to create the next larger permutation
        swap(arr, i, j);

        // Step 4: Reverse the elements from index 'i + 1' to the end of the array
        // This step arranges the right side in ascending order to get the smallest
        // lexicographical order
        reverse(arr, i + 1, arr.length - 1);

        return true; // A next permutation was found and applied
    }

    // Helper method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse a subarray from 'start' to 'end'
    private static void reverse(int[] arr, int start, int end) {
        // Swap elements moving from both ends towards the center
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Custom bubble sort to sort the array in ascending order
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Loop through the array, repeatedly bubbling the largest unsorted element to
        // the right
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if elements are out of order
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Helper method to convert array to a string format for printing
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) { // Add comma if not the last element
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Main method to test the permutation generator
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // Initial array to permute
        generatePermutations(arr); // Generate and print all permutations
    }
}
