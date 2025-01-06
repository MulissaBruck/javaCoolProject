import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Retrieve a value by key
        String key = "Banana";
        if (map.containsKey(key)) {
            System.out.println("Value for key " + key + ": " + map.get(key));
        } else {
            System.out.println(key + " not found.");
        }
    }
}
