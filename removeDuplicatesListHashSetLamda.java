import java.util.ArrayList; // Importing the ArrayList class, which is used to store the list of elements.
import java.util.List; // Importing the List interface, which ArrayList implements.
import java.util.HashSet; // Importing the HashSet class, which stores unique elements.

public class removeDuplicatesListHashSetLamda {

    // Method to remove duplicates from the given list
    public static void removeDuplicates(List<String> list) {
        // Check if the list is null (to avoid NullPointerException)
        if (list == null) {
            return; // If the list is null, return without doing anything
        }

        // Create a HashSet to keep track of unique elements
        HashSet<String> set = new HashSet<>();

        // Iterate over the list and remove any duplicates
        // The removeIf method removes elements from the list that satisfy the given
        // condition
        // The condition here is: if the item can't be added to the set (i.e., it's
        // already in the set), remove it
        list.removeIf(item -> !set.add(item)); // add returns false if the item is already in the set (duplicate)
    }

    // Main method to test the removeDuplicates method
    public static void main(String[] args) {
        // Create a new ArrayList and add some String elements to it
        List<String> list = new ArrayList<>();
        list.add("good"); // Add "good" to the list
        list.add("better"); // Add "better" to the list
        list.add("best"); // Add "best" to the list
        list.add("best"); // Add "best" again (duplicate)
        list.add("first"); // Add "first" to the list
        list.add("last"); // Add "last" to the list
        list.add("last"); // Add "last" again (duplicate)
        list.add("last"); // Add "last" again (duplicate)
        list.add("good"); // Add "good" again (duplicate)

        // Print the original list before removing duplicates
        System.out.println("Original list: " + list);

        // Call the removeDuplicates method to remove duplicates from the list
        removeDuplicates(list);

        // Print the modified list after duplicates are removed
        System.out.println("Modified list: " + list);
    }
}
