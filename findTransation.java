public class findTransation {

    public static int nUpcount(int[] arr, int Threshold) {
        int upCount = 0, previousParialSum = 0, newPartialSum = 0;

        for (int i = 0; i < arr.length; i++) {
            newPartialSum = previousParialSum + arr[i];
            if (previousParialSum <= 5 && newPartialSum > 5) {
                upCount++;
            }
            previousParialSum = newPartialSum;

        }
        return upCount;
    }

    public static void main(String[] args) {
        int n = 5; // Threshold value

        int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 }; // Example array

        // Print the result of nUpcount function
        System.out.println(" Number of Transation : " + nUpcount(a, n));
    }
}
