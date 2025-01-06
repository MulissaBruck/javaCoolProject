public class mode2 {

    public static int mostFrequentElement(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] frequency = new int[max + 1];

        for (int num : arr) {
            frequency[num]++;
        }

        int FrequencyMax = 0, mode = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > FrequencyMax) {
                FrequencyMax = frequency[i];
                mode = i;
            }
        }
        System.out.println(FrequencyMax);
        System.out.println(mode);

        return 1;
    }

    public static void main(String[] args) {
        int[] givenArray = { 5, 2, 2, 4, 2, 4, 3, 2, 4, 2, 1, 7, 2 };

        System.out.println("The most frequent element is: " + mostFrequentElement(givenArray));
    }

}
