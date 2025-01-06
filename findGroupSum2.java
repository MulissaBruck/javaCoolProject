public class findGroupSum2 {

    public static int findGroupSumEqual(int[] a) {
        int constantSum = a[0]; // The first element as the constant sum to compare against
        int GroupSum;
        int j, index = 0;
        int group = findGroup(a); // Find the number of groups

        for (int i = 0; i < group; i++) {
            GroupSum = 0;
            for (j = index; j <= i + index; j++) {
                GroupSum = GroupSum + a[j]; // Sum the elements in the current group
            }
            System.out.println("Group " + (i + 1) + ": Sum = " + GroupSum);
            if (GroupSum != constantSum) {
                return 0; // Return 0 if any group's sum does not match the constant sum
            }
            index = j; // Update index for the next group
        }

        return 1; // Return 1 if all groups match the constant sum
    }

    public static int findGroup(int[] a) {
        int n = a.length; // Length of the array
        int sum = 0; // Cumulative sum
        int i;
        for (i = 1; i < n; i++) {
            sum = sum + i; // Build the cumulative sum
            if (sum == n) {
                return i; // Return the number of groups if the cumulative sum matches the array length
            }
        }

        return -1; // Return -1 if no valid group size is found
    }

    public static void main(String[] args) {
        // Test arrays
        int[] a = { 6, 2, 4, 1, 2, 3 };
        int[] b = { 10, 6, 4, 1, 2, 7, 1, 2, 3, 4 };

        // Call and print results
        System.out.println("Result for array a: " + findGroupSumEqual(a));
        System.out.println("Result for array b: " + findGroupSumEqual(b));
        System.out.println(".....................");
        System.out.println("Number of groups for array b: " + findGroup(b));
    }
}
