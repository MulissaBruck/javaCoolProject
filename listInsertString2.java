
import java.util.*;

// Driver class
public class listInsertString2 {
    public static void main(String[] args) {
        // Create instances of different lists
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        List<String> vector = new Vector<>();
        List<String> stack = new Stack<>();

        // Adding elements to each list
        addElements(linkedList, "LinkedList");
        addElements(arrayList, "ArrayList");
        addElements(vector, "Vector");
        addElements(stack, "Stack");

        // Perform insertions
        System.out.println("\nPerforming Insertions...");

        // LinkedList insertions
        System.out.println("\nBefore LinkedList insertion: " + linkedList);
        insertFirstAndLast(linkedList, "G", "s");
        System.out.println("After LinkedList insertion: " + linkedList);

        // ArrayList insertions
        System.out.println("\nBefore ArrayList insertion: " + arrayList);
        insertFirstAndLast(arrayList, "G", "s");
        System.out.println("After ArrayList insertion: " + arrayList);

        // Vector insertions
        System.out.println("\nBefore Vector insertion: " + vector);
        insertFirstAndLast(vector, "G", "s");
        System.out.println("After Vector insertion: " + vector);

        // Stack insertions
        System.out.println("\nBefore Stack insertion: " + stack);
        insertFirstAndLast(stack, "G", "s");
        System.out.println("After Stack insertion: " + stack);
    }

    // Helper method to add elements to the list
    public static void addElements(List<String> list, String listType) {
        list.add("e");
        list.add("e");
        list.add("k");
        System.out.println("\n" + listType + " before insertion: " + list);
    }

    // Helper method to insert elements at first and last positions
    public static void insertFirstAndLast(List<String> list, String first, String last) {
        if (list instanceof LinkedList) {
            // Insert at the first and last position for LinkedList
            ((LinkedList<String>) list).addFirst(first);
            ((LinkedList<String>) list).addLast(last);
        } else if (list instanceof ArrayList) {
            // Insert at the first and last position for ArrayList
            list.add(0, first);
            list.add(last);
        } else if (list instanceof Vector) {
            // Insert at the first and last position for Vector
            list.add(0, first);
            list.add(last);
        } else if (list instanceof Stack) {
            // Insert at the first and last position for Stack
            ((Stack<String>) list).insertElementAt(first, 0);
            ((Stack<String>) list).push(last);
        }
    }
}
