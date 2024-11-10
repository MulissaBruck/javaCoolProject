import java.util.ArrayList; // Import ArrayList class for dynamic list of items
import java.util.HashSet; // Import HashSet class for a set of unique items
import java.util.List; // Import List interface for a generic list type

public class ListHashsetNormalArray {

    public static void main(String[] args) {
        // 1. Using an Array
        int[] numberArray = { 1, 2, 3, 4, 5, 3, 2, 1 }; // Arrays can contain duplicates
        System.out.print("Array: ");
        for (int number : numberArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 2. Using an ArrayList (a type of List)
        List<Integer> numberList = new ArrayList<>(); // Create an ArrayList
        for (int number : numberArray) {
            numberList.add(number); // Add elements from array to ArrayList
        }
        System.out.println("ArrayList (with duplicates): " + numberList);

        // 3. Using a HashSet to remove duplicates
        HashSet<Integer> numberSet = new HashSet<>(numberList); // Create a HashSet from the list
        System.out.println("HashSet (no duplicates): " + numberSet);

        // 4. Convert HashSet back to ArrayList to maintain unique values as a List
        List<Integer> uniqueNumberList = new ArrayList<>(numberSet);
        System.out.println("Unique ArrayList (converted back from HashSet): " + uniqueNumberList);
    }
}
