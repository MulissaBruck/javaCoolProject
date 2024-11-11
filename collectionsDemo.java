import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {

        // 1. Creating a List using ArrayList
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        // 2. Accessing List elements
        System.out.println("List of Fruits: " + fruitsList); // Output: [Apple, Banana, Orange]
        System.out.println("First Fruit in List: " + fruitsList.get(0)); // Output: Apple

        // 3. Creating a normal array of fruits
        String[] fruitsArray = { "Mango", "Pineapple", "Peach" };

        // 4. Adding elements from the normal array into the ArrayList
        for (String fruit : fruitsArray) {
            fruitsList.add(fruit);
        }
        System.out.println("\nUpdated List of Fruits after adding from Array: " + fruitsList); // Output: [Apple,
                                                                                               // Banana, Orange, Mango,
                                                                                               // Pineapple, Peach]

        // 5. Creating a HashSet to store unique fruits
        HashSet<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Grapes");
        fruitsSet.add("Mango");

        // 6. Adding elements from the List into the HashSet (duplicates will be
        // removed)
        fruitsSet.addAll(fruitsList);
        System.out.println("\nHashSet after adding elements from List: " + fruitsSet); // Output: [Apple, Banana,
                                                                                       // Orange, Mango, Grapes,
                                                                                       // Pineapple, Peach]

        // 7. Checking if HashSet contains a specific fruit
        boolean containsMango = fruitsSet.contains("Mango");
        System.out.println("Does HashSet contain Mango? " + containsMango); // Output: true

        // 8. Converting List to Array
        String[] fruitsListArray = new String[fruitsList.size()];
        fruitsList.toArray(fruitsListArray);
        System.out.println("\nList converted to Array:");
        for (String fruit : fruitsListArray) {
            System.out.print(fruit + " "); // Output: Apple Banana Orange Mango Pineapple Peach
        }
        System.out.println();

        // 9. Converting HashSet to ArrayList
        ArrayList<String> fruitsArrayListFromSet = new ArrayList<>(fruitsSet);
        System.out.println("\nArrayList created from HashSet: " + fruitsArrayListFromSet); // Output: [Apple, Banana,
                                                                                           // Orange, Mango, Grapes,
                                                                                           // Pineapple, Peach]

        // 10. Performing operations on the final ArrayList
        fruitsArrayListFromSet.add("Strawberry");
        fruitsArrayListFromSet.remove("Grapes");
        System.out.println("\nFinal ArrayList after adding and removing elements: " + fruitsArrayListFromSet); // Output:
                                                                                                               // [Apple,
                                                                                                               // Banana,
                                                                                                               // Orange,
                                                                                                               // Mango,
                                                                                                               // Pineapple,
                                                                                                               // Peach,
                                                                                                               // Strawberry]
    }
}
