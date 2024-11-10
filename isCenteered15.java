public class isCenteered15 {

    public static int isCentered15(int[] a) {

        int mid = a.length / 2;
        int sum = a[mid];
        if (sum == 15) {

            return 1;
        }

        for (int i = 1; i < mid; i++) {
            if (i > 0 && i < a.length - 1) {
                sum = sum + a[mid - i] + a[mid + 1];
                if (sum == 15) {

                    return 1;
                }
            }
        }
        System.out.println(sum);
        System.out.println(mid);

        return 0;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] givenArray1 = { 3, 2, 10, 4, 1, 6, 9 };
        System.out.println("Test Case 1 Result: " + isCentered15(givenArray1)); //
        // Should return 1

        // Test case 2
        int[] givenArray2 = { 6, 5, 4 };
        System.out.println("Test Case 2 Result: " + isCentered15(givenArray2)); //
        // Should return 1

        // Test case 3 with a focused example
        int[] givenArray3 = { 1, 4, 7, 3, 5, 6, 1, 8, 6, 9, 12, 0, 3 };
        System.out.println("Test Case 3 Result: " + isCentered15(givenArray3)); //
        // Check this case
    }

}
