
// Java program to print the first and last element of a List
import java.util.ArrayList;
import java.util.List;

public class listFirstLastElement {

    // Method to get the first and last elements from a List
    public static void getFirstLast(List<Integer> list) {
        // Displaying the ArrayList elements
        System.out.println("ArrayList contains: " + list);

        // Check if the list is not null and not empty
        if (list != null && !list.isEmpty()) {
            // Print the first element
            System.out.println("First element is: " + list.get(0));

            // Print the last element
            System.out.println("Last element is: " + list.get(list.size() - 1));
        } else {
            System.out.println("The list is empty or null.");
        }
    }

    public static void main(String[] args) {
        // Creating an ArrayList of Integer and adding elements to it
        List<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(2);

        // Calling the method to print the first and last elements
        getFirstLast(al);
    }
}
