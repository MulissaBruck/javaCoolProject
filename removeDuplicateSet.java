
// Java program to remove duplicates from an ArrayList

import java.util.*; // Importing required classes

public class removeDuplicateSet {

    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        // Use LinkedHashSet to remove duplicates and maintain order
        Set<T> set = new LinkedHashSet<>(list);

        // Clear the original list and add back the unique elements
        list.clear();
        list.addAll(set);

        // Return the updated list
        return list;
    }

    // Main method
    public static void main(String[] args) {
        // ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the original ArrayList
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}
