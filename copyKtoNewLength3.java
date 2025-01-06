import java.util.Arrays;

public class copyKtoNewLength3 {

    public static int[] copyKtoNewLength(int[] arr, int lengthOut, int k) {
        int[] copyK = new int[lengthOut];
        int i = 0;
        while (i < lengthOut) {
            for (int j = 0; j < k && i < lengthOut; j++) {
                copyK[i] = arr[j];
                i++;
            }
        }

        return copyK;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9, 16, 17, 3 }; // Original array
        int lengthOut = 5; // Desired length of the new array
        int Ks = 3; // Number of elements to copy

        // Call the function and print the new array
        int[] newArray = copyKtoNewLength(arr, lengthOut, Ks);
        System.out.println("New array: " + Arrays.toString(newArray)); // Expected output: [1, 2, 5, 1]
    }

}
