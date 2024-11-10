public class isSymetric {

    public static int isSymetric(int[] a) {

        int length = a.length;
        int mid = length / 2;
        // even
        if (length % 2 == 1) {

            for (int i = 0; i < mid; i++) {
                if (a[i] != a[length - i - 1] || a[i] == a[mid] || a[mid] == a[length - i - 1]) {
                    return 0;
                }
            }
        } else {
            for (int i = 0; i <= mid; i++) {
                if (a[i] != a[length - i - 1]) {
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
