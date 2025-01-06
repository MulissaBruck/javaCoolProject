
class removeDuplicateSort {

    // Method to remove duplicates in a sorted array
    static int removeDuplicates(int[] arr) {
        int n = arr.length;

        // If the array has 0 or 1 element, it is already unique
        if (n <= 1)
            return n;

        // Index to place the next unique element
        int idx = 1;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If current element is not equal to the previous one, it is unique
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }

        // Return the count of unique elements
        return idx;
    }

    public static void main(String[] args) {
        // Input sorted array
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        // Get the size of the unique elements
        int newSize = removeDuplicates(arr);

        // Print the unique elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
