
import java.util.HashSet;

class removeDuplicateNice {

    // Method to remove duplicates from the array
    static int removeDuplicates(int[] arr) {

        // HashSet to track unique elements
        HashSet<Integer> s = new HashSet<>();

        // Index to place unique elements in the array
        int idx = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {

            // If the element is not in the HashSet, it is unique
            if (!s.contains(arr[i])) {

                // Add the element to the HashSet
                s.add(arr[i]);

                // Place the unique element at the current index
                arr[idx++] = arr[i];
            }
        }

        // Return the new size of the array containing unique elements
        return idx;
    }

    public static void main(String[] args) {

        // Input array with duplicate elements
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        // Call the method to remove duplicates and get the new size
        int newSize = removeDuplicates(arr);

        // Print the array with unique elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
