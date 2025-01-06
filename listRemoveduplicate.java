
import java.util.*;

public class listRemoveduplicate {
    public static void main(String args[]) {

        // Create an ArrayList of String type
        ArrayList<String> gfg = new ArrayList<String>();

        // Initialize the ArrayList
        gfg.add("Geeks");
        gfg.add("for");
        gfg.add("Geeks");

        // Print the original ArrayList
        System.out.println("Original ArrayList : " + gfg);

        // ----- Using LinkedHashSet -----
        System.out.println("\nUsing LinkedHashSet:\n");

        // Create a set and copy all values from the ArrayList
        Set<String> set = new LinkedHashSet<>(gfg);

        // Create a new list and copy all values from the set
        List<String> gfg1 = new ArrayList<>(set);

        // Print the modified ArrayList
        System.out.println("Modified ArrayList : " + gfg1);

        // ----- Using HashSet -----
        System.out.println("\nUsing HashSet:\n");

        // Create a set and copy all values from the ArrayList
        Set<String> set1 = new HashSet<>(gfg);

        // Create a new list and copy all values from the set
        List<String> gfg2 = new ArrayList<>(set1);

        // Print the modified ArrayList
        System.out.println("Modified ArrayList : " + gfg2);
    }
}
