
import java.util.Arrays;

public class equalsArray2 {

    // Function to check if arrays are equal
    private static void check(int a[], int b[]) {

        // Initialize result to true
        boolean res = true;

        // Check if length of the two arrays are equal
        if (a.length == b.length) {

            // Loop through elements to compare them
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {

                    // Set false if any element differs
                    res = false;
                    break;
                }
            }
        } else {

            // Set false if lengths differ
            res = false;
        }

        if (res) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {

        int a[] = { 10, 20, 30 };
        int b[] = { 10, 20, 30 };

        check(a, b);

        int c[] = { 10, 20, 30 };
        int d[] = { 45, 50, 55, 60, 65 };

        check(c, d);
    }
}
