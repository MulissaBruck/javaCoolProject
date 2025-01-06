
import java.util.*;

public class listInsertString {
    public static void main(String[] args) {
        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
        System.out.println("LinkedList before insertion: " + linkedList);
        linkedList.addFirst("G"); // Insert at first
        linkedList.addLast("s"); // Insert at last
        System.out.println("LinkedList after insertion: " + linkedList);

        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("e");
        arrayList.add("e");
        arrayList.add("k");
        System.out.println("\nArrayList before insertion: " + arrayList);
        arrayList.add(0, "G"); // Insert at first
        arrayList.add("s"); // Insert at last
        System.out.println("ArrayList after insertion: " + arrayList);

        // Vector example
        Vector<String> vector = new Vector<>();
        vector.add("e");
        vector.add("e");
        vector.add("k");
        System.out.println("\nVector before insertion: " + vector);
        vector.add(0, "G"); // Insert at first
        vector.add("s"); // Insert at last
        System.out.println("Vector after insertion: " + vector);

        // Stack example
        Stack<String> stack = new Stack<>();
        stack.push("e");
        stack.push("e");
        stack.push("k");
        System.out.println("\nStack before insertion: " + stack);
        stack.insertElementAt("G", 0); // Insert at first
        stack.push("s"); // Insert at top (last position)
        System.out.println("Stack after insertion: " + stack);
    }
}
