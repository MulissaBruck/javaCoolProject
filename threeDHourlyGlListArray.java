import java.util.*;

public class threeDHourlyGlListArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D list to store the 6x6 array
        List<List<Integer>> arr = new ArrayList<>();

        // Prompt the user to enter values
        System.out.println("Enter the 6x6 grid values row by row, separated by spaces:");
        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }

        // Display the entered values
        System.out.println("\nYou entered the following 6x6 grid:");
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i); // Get the current row
            for (int j = 0; j < row.size(); j++) {
                int value = row.get(j); // Get the current value in the row
                System.out.print(value + " "); // Print the value with a space
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Initialize variables for maximum hourglass sum and the corresponding
        // hourglass
        int maxSum = Integer.MIN_VALUE;
        List<Integer> maxHourglass = new ArrayList<>();

        // Calculate the maximum hourglass sum
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Extract the hourglass values
                int top = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int middle = arr.get(i + 1).get(j + 1);
                int bottom = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int sum = top + middle + bottom;

                // Update maxSum and maxHourglass if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;
                    maxHourglass = Arrays.asList(
                            arr.get(i).get(j), arr.get(i).get(j + 1), arr.get(i).get(j + 2),
                            arr.get(i + 1).get(j + 1),
                            arr.get(i + 2).get(j), arr.get(i + 2).get(j + 1), arr.get(i + 2).get(j + 2));
                }
            }
        }

        // Display the maximum hourglass sum and its contributing values
        System.out.println("\nMaximum hourglass sum: " + maxSum);
        System.out.println("Hourglass contributing to the maximum sum:");
        System.out.println(maxHourglass.get(0) + " " + maxHourglass.get(1) + " " + maxHourglass.get(2));
        System.out.println("  " + maxHourglass.get(3));
        System.out.println(maxHourglass.get(4) + " " + maxHourglass.get(5) + " " + maxHourglass.get(6));

        scanner.close();
    }
}
