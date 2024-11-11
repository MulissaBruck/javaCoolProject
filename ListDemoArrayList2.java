import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemoArrayList2 {
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

        // 9. Sorting the List
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 5, 1, 8, 2);
        Collections.sort(numbers);
        System.out.println("\nSorted List: " + numbers); // Output: [1, 2, 3, 5, 8]

        // 10. Reversing the List
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers); // Output: [8, 5, 3, 2, 1]

        // 11. Finding an Element's Index
        int index = numbers.indexOf(3);
        System.out.println("Index of 3: " + index); // Output: 2

        // 12. Converting List to Array Using `for` Loop and Size
        Integer[] numberArray = new Integer[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numberArray[i] = numbers.get(i);
        }
        System.out.println("List as Array (using for loop):");
        for (int num : numberArray) {
            System.out.print(num + " "); // Output: 8 5 3 2 1
        }
        System.out.println();

        // 12.2. Converting List to Array
        Integer[] numberArray2 = numbers.toArray(new Integer[0]);
        System.out.println("List as Array:");
        for (int num : numberArray2) {
            System.out.print(num + " "); // Output: 8 5 3 2 1
        }
        System.out.println();

        // 13. Clearing the List
        numbers.clear();
        System.out.println("List after clearing: " + numbers); // Output: []
    }
}
