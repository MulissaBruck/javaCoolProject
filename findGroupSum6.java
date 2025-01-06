public class findGroupSum6 {

    public static int findGroupSumEqual(int[] arr) {
        int groupSize = 1, length = arr.length;
        while (length - groupSize >= 0) {
            length = length - groupSize;
            groupSize++;
        }
        groupSize = groupSize - 1;
        System.out.println("counter" + groupSize);
        int i = 1, index = 0;
        while (i <= groupSize) {
            int sum = 0;
            System.out.println("group" + i);
            for (int j = index; j < i + index; j++) {

                // System.out.println(arr[j]);
                sum = sum + arr[j];
            }
            System.out.println("The sum of each group" + sum);
            index = i + index;
            i++;
        }

        return groupSize - 1;
    }

    public static void main(String[] args) {
        int[] a = { 6, 2, 4, 1, 2, 3 }; // Test array 1
        int[] b = { 10, 6, 4, 1, 3, 7, 1, 2, 3, 4 }; // Test array 2
        int[] c = { 15, 10, 5, 5, 3, 7, 4, 1, 3, 7, 1, 2, 3, 4, 5 }; // Test array 3

        // Print results for each test array
        System.out.println("Result for array a: " + findGroupSumEqual(b));
        /*
         * System.out.println(".....................");
         * System.out.println("Result for array b: " + findGroupSumEqual(b));
         * System.out.println(".....................");
         * System.out.println("Result for array c: " + findGroupSumEqual(c));
         */
    }

}
