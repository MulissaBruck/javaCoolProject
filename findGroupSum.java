public class findGroupSum {

    public static int findGroupSumEqual(int[] a) {

        int constantSum = a[0], GroupSum;
        int j, index = 0;
        int group = findGroup(a);
        for (int i = 0; i < group; i++) {
            GroupSum = 0;
            for (j = index; j <= i + index; j++) {
                GroupSum = GroupSum + a[j];
            }
            System.out.println(GroupSum);
            if (GroupSum != constantSum) {
                return 0;
            }

            index = j;

        }

        return 1;
    }

    public static int findGroup(int[] a) {
        int n = a.length;
        int sum = 0;
        int i;
        for (i = 1; i < n; i++) {
            sum = sum + i;
            if (sum == n) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        // int[] a = { 6, 2, 4, 1, 2, 3 };
        int[] b = { 10, 6, 4, 1, 3, 7, 1, 2, 3, 4 };
        // int[] c = { 15, 10, 5, 5, 3, 7, 4, 1, 3, 7, 1, 2, 3, 4, 5 };

        // System.out.println(findGroupSumEqual(a));
        System.out.println(findGroupSumEqual(b));
        System.out.println(".....................");
        System.out.println(findGroup(b));
    }

}
