import java.util.*;

public class listSublist2 {
    public static void main(String[] args) {
        try {
            // ArrayList Example
            List<Integer> arrayList = Arrays.asList(1, 4, 9, 25, 36);
            System.out.println("ArrayList: " + arrayList);
            System.out.println("Sublist of ArrayList: " + arrayList.subList(2, 4));

            // LinkedList Example
            List<String> linkedList = Arrays.asList("Example", "in", "Geeks", "for", "Geeks");
            System.out.println("LinkedList: " + linkedList);
            System.out.println("Sublist of LinkedList: " + linkedList.subList(2, 5));

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid range: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }
}
