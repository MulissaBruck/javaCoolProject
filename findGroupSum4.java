public class findGroupSum4 {
    public static int findGroupSumEqual(int[] arr) {
        int groupSize = 1, startIndex = 0, length = arr.length;

        while (length - groupSize >= 0) {
            System.out.println("groupSize" + groupSize);
            for (int i = startIndex; i < groupSize + startIndex; i++) {

                System.out.println(arr[i]);

            }
            startIndex = startIndex + groupSize;
            length = length - groupSize;
            groupSize++;

        }

        return 1;
    }

    public static void main(String[] args) {
        // Test arrays
        int[] a = { 6, 2, 4, 1, 2, 3 };
        int[] b = { 10, 6, 4, 1, 2, 7, 1, 2, 3, 4 };

        // Call and print results
        System.out.println("Result for array a: " + findGroupSumEqual(b));
        // System.out.println("Result for array b: " + findGroupSumEqual(b));
        System.out.println(".....................");
        // System.out.println("Number of groups for array b: " + findGroupSumEqual(b));
    }
}
