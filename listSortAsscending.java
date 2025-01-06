
// Java program to demonstrate 
// How to sort ArrayList in ascending order 

import java.util.*;

public class listSortAsscending {
    public static void main(String args[]) {

        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Populate the ArrayList
        list.add("Geeks");
        list.add("For");
        list.add("ForGeeks");
        list.add("GeeksForGeeks");
        list.add("A computer portal");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: " + list);

        // Sort the ArrayList in ascending order
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in Ascending order: " + list);
    }
}
