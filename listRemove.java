
// Java code to remove a subList using subList(a, b).clear() method
import java.util.*;

public class listRemove {
    public static void main(String args[]) {

        // Creating an empty AbstractList
        AbstractList<String> list = new LinkedList<>();

        // Adding elements to the list
        list.add("GFG");
        list.add("for");
        list.add("Geeks");
        list.add("computer");
        list.add("portal");

        // Output the list
        System.out.println("Original List: " + list);

        // Using subList and clear method to remove elements in the range
        list.subList(1, 3).clear();

        // Output the final list
        System.out.println("Final List: " + list);
    }
}
