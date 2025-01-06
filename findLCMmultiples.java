public class findLCMmultiples {
    public static int findSmallCM(int n1, int n2) {
        int[] arr = new int[10];
        int mult = 1, num1 = 1, num2 = 1;
        for (int i = 0; i < arr.length;) {
            num1 = mult * n1;
            num2 = mult * n2;
            if (isThere(arr, num1) == false) {
                arr[i] = mult * n1;
                i++;
            } else
                return mult * n1;
            if (isThere(arr, num2) == false) {
                arr[i] = mult * n2;
                i++;
            } else
                return mult * n2;
            mult++;
        }
        return -1;
    }

    public static boolean isThere(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int n1 = 8, n2 = 12;

        System.out.println(findSmallCM(n1, n2));

    }

}
