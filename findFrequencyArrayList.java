import java.util.ArrayList;
import java.util.HashSet;

public class findFrequencyArrayList {

    public static int mostFrequentCount(int[] arr) {
        int max = 0, count;
        HashSet<Integer> frequent = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            frequent.add(arr[i]);

        }
        for (int value : frequent) {
            System.out.println(value);
        }

        for (int value : frequent) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (value == arr[j]) {
                    count++;
                    if (max < count) {
                        max = count;
                        System.out.println(value);
                    }
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example arrays with elements
        int[] a = { 4, 1, 1, 3, 1, 1 };
        int[] b = { 1, 1, 1, 2, 2 };

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element in array A occurs: " + mostFrequentCount(a) + " times");
        System.out.println("The most frequent element in array B occurs: " + mostFrequentCount(b) + " times");
    }

}
