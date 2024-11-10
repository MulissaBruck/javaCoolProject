import java.util.Arrays;

public class removeDuplicate5 {

    public static int[] removeDuplicate(int[] a) {
        int length = a.length;
        int[] tempArray = new int[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            // Only add the element if it does not already exist in tempArray
            if (exist(tempArray, a[i]) == 0) {
                tempArray[uniqueCount] = a[i];
                uniqueCount++;
            }
        }

        // Create the result array and manually copy elements
        int[] resultArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;
    }

    public static int exist(int[] ar, int value) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == value) {
                return 1; // Return 1 if the element already exists
            }
        }
        return 0; // Return 0 if the element does not exist
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 6, 5, 2 };
        System.out.println(Arrays.toString(removeDuplicate(a)));

        int[] b = { 1, 2, 3, 1, 2, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicate(b)));
    }
}
