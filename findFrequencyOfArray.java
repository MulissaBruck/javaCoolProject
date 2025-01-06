public class findFrequencyOfArray {

    public static int frequentlyOccure(int[] arr) {
        int ElementFrqCount, FrqElement = 0, maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            ElementFrqCount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ElementFrqCount++;
                }
            }
            if (ElementFrqCount > maxCount) {
                maxCount = ElementFrqCount;
                FrqElement = arr[i];
                System.out.println(FrqElement);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        // Example array with elements
        int a[] = { 4, 1, 1, 3, 1, 1 };
        int b[] = { 1, 1, 1, 2, 2 };

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element occurs: " + frequentlyOccure(a) + " times");
    }

}
