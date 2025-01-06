
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class removeDuplicateStream {
    public static void main(String[] args) {
        // Input list with duplicates
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the ArrayList before removing duplicates
        System.out.println("ArrayList with duplicates: " + list);

        // Use Java 8 Stream API to remove duplicates
        List<Integer> newList = list.stream()
                .distinct() // Filters unique elements
                .collect(Collectors.toList()); // Collects results into a new List

        // Print the ArrayList after removing duplicates
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}
