import java.util.ArrayList; // Import ArrayList class to create a list
import java.util.HashSet; // Import HashSet class to create a set
import java.util.List; // Import List interface for flexibility in list type

public class ListHashsetArryList {

    public static void main(String[] args) {
        // Create a new ArrayList of strings and add some items, including duplicates
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("apple"); // Duplicate entry
        myList.add("orange");
        myList.add("banana"); // Duplicate entry
        myList.add("grape");

        // Print the original list, which includes duplicates
        System.out.println("Original List (with duplicates): " + myList);

        // Create a HashSet from the List to remove duplicates automatically
        HashSet<String> uniqueSet = new HashSet<>(myList);

        // Print the unique set, which automatically removed duplicates
        System.out.println("HashSet (no duplicates): " + uniqueSet);

        // If you need to convert it back to a List (without duplicates), you can do
        // this:
        List<String> uniqueList = new ArrayList<>(uniqueSet);

        // Print the new list, which has duplicates removed
        System.out.println("Unique List (converted back to List): " + uniqueList);
    }
}
