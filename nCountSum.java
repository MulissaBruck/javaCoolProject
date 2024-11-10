public class nCountSum {

    public static int nCount(int[] a, int n) {
        int nCount = 0;

        // Loop through the array to find pairs that sum to 'n'
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == n) {
                    nCount++;
                }
            }
        }

        // Return 1 if at least one pair sums to 'n', otherwise return 0
        return (nCount >= 1) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = { 7, 3, 3, 2, 4 };

        // Test case 1: n = 6
        int n1 = 6;
        System.out.println("For n = " + n1 + ": " + nCount(a, n1)); // Expected output: 1

        // Test case 2: n = 10
        int n2 = 10;
        System.out.println("For n = " + n2 + ": " + nCount(a, n2)); // Expected output: 1
    }
}
