
// Java program to remove duplicates from ArrayList
import java.util.*;

public class removeDuplicateTlist {

    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the original list
        for (T element : list) {

            // Add the element to newList if it is not already present
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        // Return the list with duplicates removed
        return newList;
    }

    // Driver code
    public static void main(String[] args) {

        // Create an ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the original ArrayList
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList after removing duplicates
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}
