import java.util.HashSet;
import java.util.Iterator;

public class hashDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Display set
        System.out.println("Initial HashSet: " + set);

        // Adding duplicate (will not change the set)
        set.add("Apple");

        // Remove element
        boolean removed = set.remove("Banana");
        System.out.println("Removed Banana: " + removed); // Output: true

        // Check if an element is in the set
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple); // Output: true

        // Check size
        System.out.println("Size of set: " + set.size()); // Output: 2

        // Equals method
        HashSet<String> set2 = new HashSet<>();
        set2.add("Cherry");
        set2.add("Apple");
        System.out.println("set equals set2? " + set.equals(set2)); // Output: true

        // Iterate with for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clear the set
        set.clear();
        System.out.println("Set after clearing: " + set); // Output: []
    }
}
