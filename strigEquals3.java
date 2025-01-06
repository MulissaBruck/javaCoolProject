
// Java program to Compare two strings
// lexicographically using Object.equals()
import java.util.Objects;

public class strigEquals3 {

    public static void main(String[] args) {

        // Create a string object
        // and a null value
        String s1 = "Java";
        String s2 = null;

        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(null, null));
    }
}