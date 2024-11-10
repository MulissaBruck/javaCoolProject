import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicateList {

    public static int[] removeDuplicate(int[] arr) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // Only add element if it's not already in the list
            if (!CheckExist(uniqueList, arr[i])) {
                uniqueList.add(arr[i]);
            }
        }

        // Convert the ArrayList to an array
        int[] resultArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            resultArray[i] = uniqueList.get(i);
        }

        return resultArray;
    }

    // Check if the ArrayList already contains the element
    public static boolean CheckExist(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 6, 5, 2 };
        System.out.println(Arrays.toString(removeDuplicate(a))); // Output should be [2, 3, 5, 6]

        int[] b = { 1, 2, 3, 1, 2, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicate(b))); // Output should be [1, 2, 3, 4, 5]
    }
}
