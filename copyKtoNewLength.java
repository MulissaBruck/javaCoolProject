import java.util.Arrays;

public class copyKtoNewLength {

    public static int[] copyKtoNewLength(int[] a, int newLength, int k) {

        if ((a == null) || (a.length < newLength) || (k < 0) || (k >= newLength) || (newLength < 1) || (a.length < k)) {
            return null; // Invalid input
        }
        int[] newArray = new int[newLength];

        int length = a.length;
        int count = 0;
        while (count < newLength) {
            for (int i = 0; i < k; i++) {
                if (count < newLength) {
                    newArray[count] = a[i];
                    count++;

                    System.out.println(count);
                    System.out.println(" @@@" + i);
                }

            }

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9, 16, 17, 3 }; // Original array
        int lengthOut = 5; // Desired length of the new array
        int Ks = 4; // Number of elements to copy

        // Call the function and print the new array
        int[] newArray = copyKtoNewLength(arr, lengthOut, Ks);
        System.out.println("New array: " + Arrays.toString(newArray)); // Expected output: [1, 2, 5, 1]
    }

}
