public class findGroupSum5 {

    public static void main(String[] args) {
        int[] a = { 6, 2, 4, 1, 2, 3 }; // Example array

        int length = a.length; // Total length of the array
        int startIndex = 0; // Start index for each group

        // Outer loop: Control the group size (i)
        for (int i = 1; length - i >= 0; i++) {
            int sum = 0; // Reset the sum for each group

            // Inner loop: Sum the elements for the current group of size 'i'
            for (int j = startIndex; j < startIndex + i; j++) {
                sum += a[j];
            }

            // Print the sum of the current group
            System.out.println("Group size: " + i + ", Sum: " + sum);

            // Update the startIndex to move to the next group
            startIndex += i;

            // Decrease the remaining length of the array
            length -= i;
        }
    }
}
