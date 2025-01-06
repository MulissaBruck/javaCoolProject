import java.util.ArrayList; // Importing ArrayList to create a dynamically resizable list of items.
import java.util.List; // Importing List interface, which ArrayList implements, to represent an ordered collection.
import java.util.HashSet; // Importing HashSet to track unique items by storing each item only once.
import java.util.Iterator; // Importing Iterator to safely traverse and modify the list during iteration.

public class removeDuplicatesListHashSet {

    // Method to remove duplicates from the list using an iterator and HashSet
    public static void removeDuplicates(List<String> list) {
        // Check if the list is null to avoid a NullPointerException
        if (list == null) {
            return; // Exit the method if the list is null, as no operation is needed.
        }

        // Create a HashSet to store encountered items; it will prevent duplicate
        // entries.
        HashSet<String> encounteredItems = new HashSet<>();

        // Initialize an iterator to traverse the list and modify it if needed
        Iterator<String> listIterator = list.iterator();
        // Loop through |each element in the list using the iterator
        while (listIterator.hasNext()) {
            String currentItem = listIterator.next(); // Retrieve the next item in the list

            // Check if the item has already been encountered (indicating it is a duplicate)
            if (encounteredItems.contains(currentItem)) {
                listIterator.remove(); // Remove the duplicate item from the list
            } else {
                encounteredItems.add(currentItem); // Add the unique item to the HashSet for tracking
            }
        }
    }

    // Main method to test the removeDuplicates method
    public static void main(String[] args) {
        // Create a new ArrayList and populate it with String elements, including
        // duplicates
        List<String> list = new ArrayList<>();
        list.add("good"); // Add "good" to the list
        list.add("better"); // Add "better" to the list
        list.add("best"); // Add "best" to the list
        list.add("best"); // Add "best" again, which is a duplicate
        list.add("first"); // Add "first" to the list
        list.add("last"); // Add "last" to the list
        list.add("last"); // Add "last" again, which is a duplicate
        list.add("last"); // Add "last" again, another duplicate
        list.add("good"); // Add "good" again, which is a duplicate

        // Display the original list with duplicates included
        System.out.println("Original list: " + list);

        // Call the removeDuplicates method to remove duplicate entries from the list
        removeDuplicates(list);

        // Display the modified list after duplicates have been removed
        System.out.println("Modified list: " + list);
    }
}
