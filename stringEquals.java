
// Java program to Compare two strings
// lexicographically using String.equalsIgnoreCase()
public class stringEquals {

    public static void main(String args[]) {

        // Create two string objects with different cases
        String s1 = new String("Java");
        String s2 = new String("JAVA");

        System.out.println(s1.equalsIgnoreCase(s2));
    }
}