import java.util.HashSet;

public class HashSetStreamExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Target element to "get"
        String target = "Banana";

        // Use Stream to find the element
        String result = set.stream()
                .filter(e -> e.equals(target))
                .findFirst()
                .orElse(null);

        System.out.println("Result: " + (result != null ? result : "Not Found"));
    }
}
