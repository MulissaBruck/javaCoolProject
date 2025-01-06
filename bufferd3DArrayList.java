import java.io.*;
import java.util.*;

public class bufferd3DArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Create a 2D ArrayList to store the 6x6 grid
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        System.out.println("Please enter a 6x6 grid of integers, row by row (space-separated):");

        // Read user input for the grid
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            String[] row = bufferedReader.readLine().trim().split(" ");
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (String value : row) {
                currentRow.add(Integer.parseInt(value));
            }
            arr.add(currentRow);
        }

        // Display the entered grid
        System.out.println("\nYou entered the following 6x6 grid:");
        for (ArrayList<Integer> row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
