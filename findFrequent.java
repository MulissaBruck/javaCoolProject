/*Example Comparison
Consider an array: {1, 2, 2, 3, 3, 3}.

j = 0: When i = 2 (with a[i] = 2), you’ll count all occurrences of 2 again from the start of the array.
j = i: When i = 2 (with a[i] = 2), you start counting from index 2, avoiding previous occurrences of 2 
at index 1.
Starting from j = i is often more efficient in frequency-counting problems to avoid redundant counting, 
especially if you only need to count each unique element once. */

public class findFrequent {

    public static int frequentlyOccure(int[] a) {
        int maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {

                    count++;
                }
            }
            if (count > maxCount) {
                int num = a[i];
                // System.out.println(num);

                maxCount = count;
            }

        }

        return maxCount;
    }

    public static void main(String[] args) {
        // Example array with elements
        int a[] = { 4, 1, 1, 3, 1, 1 };
        int b[] = { 1, 1, 1, 2, 2 };

        // Print how many times the most frequent element occurs
        System.out.println("The most frequent element occurs: " + frequentlyOccure(b) + " times");
    }

}
