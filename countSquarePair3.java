public class countSquarePair3 {

    public static int countSquarePairs(int[] arr) {
        int pairCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int a1 = arr[i];
                int a2 = arr[j];

                if (isPerfectSquare(a1 + a2)) {
                    pairCount++;
                }

            }
        }

        return pairCount;
    }

    // Helper method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr = { 9, 0, 4, 16 };

        // Output result
        System.out.println("Total square pairs: " + countSquarePairs(arr));
    }
}
