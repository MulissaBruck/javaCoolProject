
import java.util.*; // Importing necessary classes from Java's util package

public class listAll {
    public static void main(String args[]) {

        // Demonstrating ArrayList
        List<Integer> list = new ArrayList<>(); // Creating an ArrayList
        list.add(1); // Adding 1 to the ArrayList
        list.add(3); // Adding 3 to the ArrayList
        System.out.println("ArrayList : " + list.toString()); // Printing the ArrayList

        // Demonstrating LinkedList
        List<Integer> llist = new LinkedList<>(); // Creating a LinkedList
        llist.add(2); // Adding 2 to the LinkedList
        llist.add(4); // Adding 4 to the LinkedList
        System.out.println("LinkedList : " + llist.toString()); // Printing the LinkedList

        // Demonstrating Stack
        List<Integer> stack = new Stack<>(); // Creating a Stack
        stack.add(3); // Adding 3 to the Stack
        stack.add(1); // Adding 1 to the Stack
        System.out.println("Stack : " + stack.toString()); // Printing the Stack
    }
}
