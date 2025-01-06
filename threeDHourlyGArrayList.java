import java.util.ArrayList;
import java.util.Scanner;

public class threeDHourlyGArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D ArrayList to store the 6x6 grid
        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

        // Prompt the user to enter values
        System.out.println("Enter the 6x6 grid values row by row, separated by spaces:");
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(scanner.nextInt());
            }
            grid.add(row);
        }

        // Display the entered values
        System.out.println("\nYou entered the following 6x6 grid:");
        for (int i = 0; i < grid.size(); i++) {
            ArrayList<Integer> row = grid.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }

        // Initialize variables for maximum hourglass sum and the corresponding
        // hourglass
        int maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> maxHourglass = new ArrayList<>();

        // Calculate the maximum hourglass sum
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Extract the hourglass values
                int top = grid.get(i).get(j) + grid.get(i).get(j + 1) + grid.get(i).get(j + 2);
                int middle = grid.get(i + 1).get(j + 1);
                int bottom = grid.get(i + 2).get(j) + grid.get(i + 2).get(j + 1) + grid.get(i + 2).get(j + 2);
                int sum = top + middle + bottom;

                // Update maxSum and maxHourglass if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;
                    maxHourglass.clear();
                    maxHourglass.add(grid.get(i).get(j));
                    maxHourglass.add(grid.get(i).get(j + 1));
                    maxHourglass.add(grid.get(i).get(j + 2));
                    maxHourglass.add(grid.get(i + 1).get(j + 1));
                    maxHourglass.add(grid.get(i + 2).get(j));
                    maxHourglass.add(grid.get(i + 2).get(j + 1));
                    maxHourglass.add(grid.get(i + 2).get(j + 2));
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
