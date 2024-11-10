public class stantonMeasure {

    public static int stantonMeasure(int a[]) {

        int count1s = 0;
        int countNum = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {
                count1s++;
            }
        }

        for (int i = 0; i < a.length; i++) {

            if (count1s == a[i]) {
                countNum++;

            }
        }
        return countNum;

    }

    public static void main(String[] args) {
        int[] given = { 1, 4, 3, 2, 1, 2, 3, 2 };

        // Print the Stanton measure of the given array
        System.out.println(stantonMeasure(given)); // Expected output: 3
    }

}
