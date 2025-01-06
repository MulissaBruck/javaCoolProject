
import java.util.*;

public class listCollection {
    public static void main(String args[]) {

        // Create an empty list
        List<Integer> list = new ArrayList<Integer>();

        // Instantiating list using Collections.addAll()
        Collections.addAll(list, 1, 2, 3, 4);

        // Print the list
        System.out.println("List : " + list.toString());
    }
}