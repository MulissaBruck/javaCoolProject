
// Java program to convert List of String
// to comma separated String

import java.util.*;

public class listConvertToString {
    public static void main(String args[]) {

        // Get the List of String
        List<String> list = new ArrayList<>(
                Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));

        // Print the List of String
        System.out.println("List of String: " + list);

        // Convert the List of String to String
        String string = String.join(",", list);

        // Print the comma separated String
        System.out.println("Comma separated String: " + string);
    }
}
