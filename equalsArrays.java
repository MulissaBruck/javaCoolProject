
import java.util.Arrays;

public class equalsArrays {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30 };
        int b[] = { 10, 20, 30 };

        // Using Arrays.equals() to check
        // if two arrays are equal
        boolean r = Arrays.equals(a, b);

        if (r) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
