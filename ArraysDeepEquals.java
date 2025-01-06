
import java.util.Arrays;

public class ArraysDeepEquals {

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

        Integer[][] arr1 = { { 10, 20, 30 }, { 40, 50 } };
        Integer[][] arr2 = { { 10, 20, 30 }, { 40, 50 } };

        check(arr1, arr2);

        Integer[][] arr3 = { { 10, 20, 30 }, { 40, 50 } };
        Integer[][] arr4 = { { 30, 25, 40 }, { 50, 61 } };

        check(arr3, arr4);
    }
}