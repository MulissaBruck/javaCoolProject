
// Java Program to Sort the Elements in Descending Order
// using Collections.reverseOrder()
import java.util.*;

class arrayReverseCollection {
    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
    }
}