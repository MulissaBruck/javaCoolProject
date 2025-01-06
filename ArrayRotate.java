
public class ArrayRotate {

    // Function to rotate array by d positions
    public static void Rotate(int[] arr, int d, int N) {
        // Reverse the first part of the array (0 to d-1)
        reverse(arr, 0, d - 1);

        // Reverse the second part of the array (d to N-1)
        reverse(arr, d, N - 1);

        // Reverse the entire array (0 to N-1)
        reverse(arr, 0, N - 1);
    }

    // Helper function to reverse the array between two indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    // Function to print the array
    public static void PrintTheArray(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length; // Length of the array
        int d = 2; // Number of positions to rotate

        // Function calling
        Rotate(arr, d, N); // Rotate the array by 'd' positions
        PrintTheArray(arr, N); // Print the rotated array
    }
}
