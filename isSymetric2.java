public class isSymetric2 {
    public static int isSymetric(int[] arr) {
        int len = arr.length, mid = 0;
        if (len % 2 == 1) {
            mid = len / 2;
            for (int i = 1; i <= mid; i++) {
                if (arr[mid - i] != arr[mid + i] || arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + i]) {
                    return 0;
                }
            }
        }
        if (len % 2 == 0) {
            mid = len / 2;
            for (int i = 0; i < mid; i++) {
                if (arr[i] != arr[len - i - 1]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        // Example arrays
        int[] evenArray = { 1, 2, 3, 3, 2, 1 }; // Symmetric, should return 1
        int[] oddArray = { 1, 2, 3, 4, 3, 2, 1 }; // Symmetric with unique middle, should return 1
        int[] invalidEvenArray = { 1, 2, 3, 4, 2, 1 }; // Not symmetric, should return 0
        int[] invalidOddArray = { 1, 2, 3, 3, 3, 2, 1 }; // Middle element is not unique, should return 0

        System.out.println("The arrays are :" + isSymetric(evenArray));
        System.out.println("The arrays are :" + isSymetric(oddArray));

    }
}
