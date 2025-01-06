
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listMinMax2 {

    // Function to find the minimum value in an unsorted list
    public static Integer findMin(List<Integer> list) {
        // Check if the list is empty or null
        if (list == null || list.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        // Create a new list to avoid modifying the original
        List<Integer> sortedlist = new ArrayList<>(list);

        // Sort the list in natural order
        Collections.sort(sortedlist);

        // Return the first element (minimum)
        return sortedlist.get(0);
    }

    // Function to find the maximum value in an unsorted list
    public static Integer findMax(List<Integer> list) {
        // Check if the list is empty or null
        if (list == null || list.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        // Create a new list to avoid modifying the original
        List<Integer> sortedlist = new ArrayList<>(list);

        // Sort the list in natural order
        Collections.sort(sortedlist);

        // Return the last element (maximum)
        return sortedlist.get(sortedlist.size() - 1);
    }

    public static void main(String[] args) {
        // Create an ArrayList and populate it with values
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);

        // Print the minimum and maximum values of the list
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }
}
