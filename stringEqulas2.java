
// Java Program to compare two strings
// using user-defined function
public class stringEqulas2 {

    // User-defined function
    // to compare two strings
    public static int compare(String s1, String s2) {

        // Uses compareTo method for
        // lexicographical comparison
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Domain";

        // Call the compare function
        int res = compare(s1, s2);
        System.out.println("" + res);
    }
}