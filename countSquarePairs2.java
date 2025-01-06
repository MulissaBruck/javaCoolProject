public class countSquarePairs2 {

    public static int countSqPair(int[] arr) {
        int pairCount = 0;

        // Iterate over all pairs (i, j)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a1 = arr[i];
                int a2 = arr[j];

                // Check only (a1, a2) where a1 < a2
                if (isPerfectSquare(a1 + a2)) {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }

    public static boolean isPerfectSquare(int sum) {
        for (int i = 1; i * i <= sum; i++) {
            if (i * i == sum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 9, 0, 4, 16 };

        // Output result
        System.out.println("Total square pairs: " + countSqPair(arr));
    }
}
