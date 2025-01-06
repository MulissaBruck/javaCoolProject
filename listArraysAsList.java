
import java.util.Arrays; // Importing Arrays class for asList() method
import java.util.List; // Importing List interface
import java.util.ArrayList; // Importing ArrayList class for dynamic lists

public class listArraysAsList {
    public static void main(String[] args) {

        // Creating a fixed-size list using Arrays.asList()
        List<Integer> fixedList = Arrays.asList(1, 2, 3);
        System.out.println("Fixed-Size List: " + fixedList);

        // Modifying an element in the fixed-size list (allowed)
        fixedList.set(1, 99); // Changing the second element to 99
        System.out.println("Modified Fixed-Size List: " + fixedList);

        // Attempting to add or remove elements in the fixed-size list (not allowed)
        try {
            fixedList.add(4); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add to a fixed-size list: " + e);
        }

        // Creating a dynamic list using ArrayList
        List<Integer> dynamicList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Dynamic List (Before Modification): " + dynamicList);

        // Modifying the dynamic list
        dynamicList.add(4); // Adding a new element
        dynamicList.remove(0); // Removing the first element
        dynamicList.set(1, 88); // Changing the second element
        System.out.println("Dynamic List (After Modification): " + dynamicList);
    }
}
