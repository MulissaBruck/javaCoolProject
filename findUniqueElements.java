import java.util.Arrays;

public class findUniqueElements {
    public static int[] findUniqueElements(int[] arr) {

        int index = 0;

        int[] uniqueArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (isFound(arr[i], uniqueArr) == false) {
                uniqueArr[index++] = arr[i];
            }
        }
        int[] lastUniq = new int[index];
        for (int i = 0; i < lastUniq.length; i++) {
            lastUniq[i] = uniqueArr[i];
        }
        return lastUniq;
    }

    public static boolean isFound(int value, int[] uniqArr) {

        for (int i = 0; i < uniqArr.length; i++) {
            if (uniqArr[i] == value) {
                return true;
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
            System.out.print(num + " "); // Output should be: 3 5 2 6
        }
    }
}
