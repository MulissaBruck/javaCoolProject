
import java.util.*;

public class listSublist {
    public static void main(String[] args) {
        try {
            // 1. ArrayList Example
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 9, 25, 36));
            System.out.println("ArrayList: " + arrayList);
            List<Integer> arrayListSublist = arrayList.subList(2, 4);
            System.out.println("Sublist of ArrayList: " + arrayListSublist);

            // 2. LinkedList Example
            LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Example", "in", "Geeks", "for", "Geeks"));
            System.out.println("LinkedList: " + linkedList);
            List<String> linkedListSublist = linkedList.subList(2, 5);
            System.out.println("Sublist of LinkedList: " + linkedListSublist);

            // 3. Stack Example
            Stack<Double> stack = new Stack<>();
            stack.addAll(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
            System.out.println("Stack: " + stack);
            List<Double> stackSublist = stack.subList(1, 3);
            System.out.println("Sublist of Stack: " + stackSublist);

            // 4. Vector Example
            Vector<Character> vector = new Vector<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
            System.out.println("Vector: " + vector);
            List<Character> vectorSublist = vector.subList(0, 3);
            System.out.println("Sublist of Vector: " + vectorSublist);

            // 5. Example of IllegalArgumentException
            System.out.println("\nAttempting to create sublist with invalid indices (fromIndex > toIndex)...");
            List<String> invalidSublist = linkedList.subList(4, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            // 6. Example of IndexOutOfBoundsException
            System.out.println("\nAttempting to create sublist with out-of-range indices...");
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 9, 25, 36));
            List<Integer> invalidRangeSublist = arrayList.subList(2, 10);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
