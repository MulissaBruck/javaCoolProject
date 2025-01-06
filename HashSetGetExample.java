import java.util.HashSet;

public class HashSetGetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Target element to "get"
        String target = "Banana";

        // Iterate through the set
        for (String element : set) {
            if (element.equals(target)) {
                System.out.println("Found: " + element);
                break;
            }
        }
    }
}
