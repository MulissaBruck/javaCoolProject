
import java.util.HashSet;

public class ArrayCommonElements {
    private static void findCommonElements(String[] arr1, String[] arr2) {
        HashSet<String> set = new HashSet<>();

        // Add elements of arr1 to the set
        for (String str : arr1) {
            set.add(str);
        }

        // Check if elements of arr2 are present in the set
        for (String str : arr2) {
            if (set.contains(str)) {
                System.out.println(str); // Common element found
            }
        }
    }

    public static void main(String[] args) {
        String[] arr1 = { "apple", "banana", "cherry" };
        String[] arr2 = { "cherry", "date", "apple" };

        findCommonElements(arr1, arr2);
    }
}
