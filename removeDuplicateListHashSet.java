import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicateListHashSet {

    // Method to remove duplicates using a for loop
    public static void removeDuplicates(List<String> list) {
        if (list == null) {
            return; // Return if the list is null
        }

        HashSet<String> encounteredItems = new HashSet<>(); // Set to track encountered items
        Iterator<String> listIterator = list.iterator(); // Iterator to traverse the list

        while (listIterator.hasNext()) {
            String currentItem = listIterator.next(); // Get the current item
            // If the item is a duplicate (already in the set), remove it from the list
            if (encounteredItems.contains(currentItem)) {
                listIterator.remove(); // Remove the duplicate item from the list
            } else {
                encounteredItems.add(currentItem); // Add the item to the set for future checks
            }

        }
        System.out.println("hash.." + encounteredItems);
    }

    // Main method to test the removeDuplicates method
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("good");
        list.add("better");
        list.add("best");
        list.add("best");
        list.add("first");
        list.add("last");
        list.add("last");
        list.add("last");
        list.add("good");

        // Output original list
        System.out.println("Original list: " + list);

        // Remove duplicates
        removeDuplicates(list);

        // Output modified list after duplicates are removed
        System.out.println("Modified list: " + list);
    }
}
