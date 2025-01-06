
// Java Program to Split a List into Two SubList
// Using subList() method of List class

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// Main class
public class listSplitToTwo2 {

    // Method 1
    // To split a list into two sublists in Java
    public static List[] split(List<String> list) {

        // Finding the size of the list using List.size()
        // and putting in a variable
        int size = list.size();

        // Creating new list and inserting values which are
        // returned by List.subList() method
        List<String> first = new ArrayList<>(list.subList(0, size / 2));
        List<String> second = new ArrayList<>(list.subList(size / 2, size));

        // Returning a List of arrays
        return new List[] { first, second };
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {

        // Creating an ArrayList of String type
        List<String> list = new ArrayList<String>();

        // Adding elements to List object
        // Custom input elements
        list.add("Geeks");
        list.add("Practice");
        list.add("Contribute");
        list.add("IDE");
        list.add("Courses");

        // Calling split method which returns List of arrays
        List[] lists = split(list);

        // Printing specific elements of list
        // Passing arguments within the list
        System.out.println("First Sublist: " + lists[0]);
        System.out.println("Second Sublist: " + lists[1]);
    }
}
