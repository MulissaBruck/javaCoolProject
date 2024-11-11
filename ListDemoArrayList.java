import java.util.ArrayList;
import java.util.List;

public class ListDemoArrayList {
    public static void main(String[] args) {
        // 1. Creating a List
        List<String> fruits = new ArrayList<>();

        // 2. Adding Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("List after additions: " + fruits); // Output: [Apple, Banana, Orange]

        // 3. Accessing Elements
        String firstFruit = fruits.get(0); // Accessing by index
        System.out.println("First fruit: " + firstFruit); // Output: Apple

        // 4. Updating Elements
        fruits.set(1, "Blueberry"); // Update element at index 1
        System.out.println("List after update: " + fruits); // Output: [Apple, Blueberry, Orange]

        // 5. Removing Elements
        fruits.remove("Orange"); // Remove by element
        fruits.remove(0); // Remove by index
        System.out.println("List after removals: " + fruits); // Output: [Blueberry]

        // 6. Checking for Element Existence
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("List contains Banana: " + hasBanana); // Output: false

        // 7. List Size
        int size = fruits.size();
        System.out.println("Size of the list: " + size); // Output: 1

        // 8. Iterating Over Elements
        fruits.add("Mango");
        fruits.add("Pineapple");
        System.out.println("List elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
