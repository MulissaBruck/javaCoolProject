
import java.util.Arrays;

public class equalsArrayDeep {

    // Function to check if nested arrays are equal
    private static void check(Integer[][] a, Integer[][] b) {

        // Using Arrays.deepEquals() to check if two nested arrays are equal
        boolean res = Arrays.deepEquals(a, b);

        // Printing the result directly
        if (res) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {

        // First set of arrays (identical)
        Integer[][] arr1 = { { 10, 20, 30 }, { 40, 50 } };
        Integer[][] arr2 = { { 10, 20, 30 }, { 40, 50 } };

        // Checking equality of the first pair
        check(arr1, arr2);

        // Second set of arrays (different)
        Integer[][] arr3 = { { 10, 20, 30 }, { 40, 50 } };
        Integer[][] arr4 = { { 30, 25, 40 }, { 50, 61 } };

        // Checking equality of the second pair
        check(arr3, arr4);
    }
}
