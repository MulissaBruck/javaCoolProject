
// Java program to show how to compare Strings 
// using the compareTo method
public class StringLexicComparsion {
    public static void main(String[] args) {

        // Declare and initialize strings
        String s1 = "Ram"; // First string
        String s2 = "Ram"; // Second string (same as s1)
        String s3 = "Shyam"; // Third string for comparison
        String s4 = "ABC"; // Fourth string for comparison

        // Print a header message
        System.out.println("Comparing strings with compareTo:");

        // Compare s1 with s2
        // Both strings are identical, so result will be 0
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));

        // Compare s1 with s3
        // s1 ("Ram") comes before s3 ("Shyam") lexicographically,
        // so the result will be negative
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3));

        // Compare s1 with s4
        // s1 ("Ram") comes after s4 ("ABC") lexicographically,
        // so the result will be positive
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
    }
}
