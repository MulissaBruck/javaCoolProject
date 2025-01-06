
// Java program to print Maximum and Minimum Value of a sorted List
import java.util.ArrayList;
import java.util.List;

public class listMaxMin {

    // Function to find and print the Maximum and Minimum values
    public static void getMaxMin(List<Integer> list) {

        // Displaying the ArrayList elements
        System.out.println("ArrayList contains: " + list);

        // Check if the list is not null and not empty
        if (list != null && !list.isEmpty()) {

            // Determine if the list is in increasing or decreasing order
            if (list.get(0) < list.get(list.size() - 1)) {
                // List is in increasing order
                System.out.println("Minimum Value: " + list.get(0));
                System.out.println("Maximum Value: " + list.get(list.size() - 1));
            } else {
                // List is in decreasing order
                System.out.println("Minimum Value: " + list.get(list.size() - 1));
                System.out.println("Maximum Value: " + list.get(0));
            }
        } else {
            System.out.println("The list is empty or null.");
        }
    }

    public static void main(String[] args) {
        // Creating an ArrayList of Integer and adding elements to it
        List<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);

        // Call the method to find and print the Maximum and Minimum values
        getMaxMin(al);

        // Example of an increasing order list
        List<Integer> increasingList = new ArrayList<>();
        increasingList.add(1);
        increasingList.add(2);
        increasingList.add(3);
        increasingList.add(4);
        increasingList.add(5);

        // Call the method with an increasing order list
        getMaxMin(increasingList);
    }
}
