
// Java code to remove a subList using removeRange() method
import java.util.*;

// Subclassing ArrayList to access protected removeRange()
public class listRemove2 extends ArrayList<Integer> {

    public static void main(String[] args) {

        // Create an empty array list
        listRemove2 arr = new listRemove2();
        // Add values to the list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        // Print the list before removing
        System.out.println("Original List: " + arr);

        // Remove elements from index 2 to 4
        arr.removeRange(2, 4);

        // Print the final list
        System.out.println("Final List: " + arr);
    }
}
