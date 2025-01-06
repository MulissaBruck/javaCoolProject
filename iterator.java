import java.util.*;

public class iterator {

    // Function that returns an iterator and skips elements before "###"
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();

        // Iterate over the list until "###" is found
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###")) {
                // Once we find "###", break out of the loop
                break;
            }
        }

        // Return the iterator after finding "###"
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        // Create an ArrayList and initialize it with values
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Add integers to the list
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        // Add the special string "###"
        mylist.add("###");

        // Add other strings to the list
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        // Get the iterator that skips elements before "###"
        Iterator it = func(mylist);

        // Print elements after "###"
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
