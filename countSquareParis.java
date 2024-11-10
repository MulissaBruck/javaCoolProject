public class countSquareParis {

    public static int countSquarePairs(int[] arr) {
        int count = 0;

        // Loop over all unique pairs (i, j) with i < j
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // Check if sum is a perfect square
                int sqrt = (int) Math.sqrt(sum);
                if (sqrt * sqrt == sum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ") with sum = " + sum);
                    count++;
                }
            }
        }

        // If no pairs are found, return 0
        return count;
    }

    public static void main(String[] args) {
        // Example array to check
        int[] arr1 = { 9, 0, 4, 16 };
        int[] arr2 = { 1, 8, 3, 6, 10 };
        int[] arr3 = { 2, 7, 11, 13, 17 };

        // Output result for each array
        System.out.println("Total square pairs in arr1: " + countSquarePairs(arr1));
        System.out.println("Total square pairs in arr2: " + countSquarePairs(arr2));
        System.out.println("Total square pairs in arr3: " + countSquarePairs(arr3));
    }
}
