public class isMhadiveNumber {

    /*
     * 
     * Group 1: {10} → Sum = 10
     * Group 2: {3, 7} → Sum = 10
     * Group 3: {4, 1, 5} → Sum = 10
     * Group 4: {1, 2, 3} → Sum = 6 (Doesn't match the first element)
     * 
     */

    public static int groupCount(int[] a)

    {
        int length = a.length, groupCount = 0;
        int i = 0;
        while (length - i > 0) {
            groupCount++;
            length--;
            i++;

        }
        System.out.println(groupCount);
        return groupCount;
    }

    public static int isMadhavArray(int[] a) {
        int element = 0, groupSum = a[0], groupSize = 1, index = 0;
        while (element < groupCount(a)) {
            groupSum = 0;
            for (int i = index; i < groupSize + index; i++) {
                groupSum = groupSum + a[i];

            }
            element++;
            System.out.println(groupSum);
            index = groupSize + index;
            groupSize++;

        }

        return 1;
    }

    public static void main(String[] args) {

        // Example array to check
        int[] arr = { 6, 2, 4, 1, 2, 3 };
        int[] arr2 = { 10, 3, 7, 4, 1, 5, 1, 2, 3 };

        // Output result
        if (isMadhavArray(arr) == 1) {
            System.out.println("The array is a valid Madhav array.");
        } else {
            System.out.println("The array is NOT a valid Madhav array.");
        }
    }

}
