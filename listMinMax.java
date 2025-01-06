
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listMinMax {

    // Function to find minimum value in the list
    public static Integer findMin(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return Integer.MAX_VALUE; // Handle empty or null list
        }
        return Collections.min(list); // Use built-in method for efficiency
    }

    // Function to find maximum value in the list
    public static Integer findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return Integer.MIN_VALUE; // Handle empty or null list
        }
        return Collections.max(list); // Use built-in method for efficiency
    }

    public static void main(String[] args) {
        // Create and populate the list
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 44, 11, 22, 33);

        // Print the minimum and maximum values
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }
}
