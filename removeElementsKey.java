
// Java program remove all occurrences 
// of an element from Array using naive method 
import java.util.Arrays;

class removeElementsKey {

    // function to remove all occurrences
    // of an element from an array
    public static int[] removeElements(int[] a, int k) {
        // Move all other elements to beginning
        int index = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] != k)
                a[index++] = a[i];

        // Create a copy of arr[]
        return Arrays.copyOf(a, index);
    }

    // Driver code
    public static void main(String[] args) {
        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int k = 3;
        a = removeElements(a, k);
        System.out.println(Arrays.toString(a));
    }
}