
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listArraysAsList2 {
    public static void main(String args[]) {

        // Creating a mutable list using Arrays.asList()
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3));

        // Print the list
        System.out.println("List : " + list.toString());

        list.add(5);

        // Print the list
        System.out.println("Modified list : " + list.toString());
    }
}