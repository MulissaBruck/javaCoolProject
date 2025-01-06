
import java.util.ArrayList;
import java.util.List;

public class listMinMax3 {

    // Naive function to find minimum value in an unsorted list in Java
    public static Integer findMin(List<Integer> list) {
        // Initialize min to some maximum value
        Integer min = Integer.MAX_VALUE;

        // Loop through every element in the list and compare min found so far with
        // current value
        for (Integer i : list) {
            // Update min if found to be more than the current element
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    // This function returns the maximum value in an unsorted list in Java
    public static Integer findMax(List<Integer> list) {
        // Initialize max variable to minimum value
        Integer max = Integer.MIN_VALUE;

        // Loop to compare the current max value with all list elements and find the
        // maximum value
        for (Integer i : list) {
            // Update max if found to be less than the current element
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Create an ArrayList object list
        List<Integer> list = new ArrayList<>();

        // Add elements in the ArrayList object list
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);

        // Print min and max value of the ArrayList
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }
}
