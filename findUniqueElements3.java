import java.util.Arrays;

public class findUniqueElements3 {
    public static int[] findUniqueElements(int[] arr) {
        int index = 0;
        int[] uniqueArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!isFound(arr[i], uniqueArr)) { // No size passed, calculate dynamically
                uniqueArr[index++] = arr[i];
            }
        }

        // Create a properly sized array for unique elements
        return Arrays.copyOf(uniqueArr, index);
    }

    public static boolean isFound(int value, int[] uniqArr) {
        // Dynamically calculate the size by checking initialized elements
        for (int i = 0; i < uniqArr.length; i++) {
            if (uniqArr[i] == value) {
                return true;
            }
            // Stop checking once you encounter an uninitialized (default) value
            if (uniqArr[i] == 0 && i > 0) {
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 3, 5, 6, 2, 8, 9 }; // Example input array
        int[] uniqueElements = findUniqueElements(arr);

        // Print unique elements
        System.out.print("Unique elements: ");
        for (int num : uniqueElements) {
            System.out.print(num + " "); // Output: 3 5 2 6 8 9
        }
    }
}
