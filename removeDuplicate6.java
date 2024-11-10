import java.util.Arrays;

public class removeDuplicate6 {

    public static int[] removeDuplicate(int[] arr) {
        int[] unique = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // Only add element if it doesn't already exist in the unique list
            if (CheckExist(unique, arr[i], count) == 0) {
                unique[count] = arr[i]; // Use count as the index
                count++;
            }
        }

        // Create the final array of exact size and copy unique elements
        int[] lastUnique = new int[count];
        for (int i = 0; i < count; i++) {
            lastUnique[i] = unique[i];
        }

        return lastUnique;
    }

    // Updated CheckExist method to check only up to the current count of unique
    // elements
    public static int CheckExist(int[] unique, int value, int count) {
        for (int i = 0; i < count; i++) { // Only iterate up to count
            if (unique[i] == value) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 6, 5, 2 };
        System.out.println(Arrays.toString(removeDuplicate(a))); // Output should be [2, 3, 5, 6]

        int[] b = { 1, 2, 3, 1, 2, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicate(b))); // Output should be [1, 2, 3, 4, 5]
    }
}
