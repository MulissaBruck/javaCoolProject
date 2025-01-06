import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class querry2DArrayList {

    public static void main(String[] args) {
        // Initialize the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt(); // Number of rows
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>(); // To store the rows
        // Read each row
        for (int i = 0; i < numRows; i++) {
            System.out.println("Enter the number of integers in row " + (i + 1) + ":");
            int numOfElementsInRow = scanner.nextInt(); // Number of integers in this row
            ArrayList<Integer> currentRow = new ArrayList<>(); // Create a new row
            if (numOfElementsInRow > 0) {
                System.out.println("Enter " + numOfElementsInRow + " integers separated by spaces:");
            }
            for (int j = 0; j < numOfElementsInRow; j++) {
                currentRow.add(scanner.nextInt()); // Add integers to the row
            }

            rows.add(currentRow); // Add the row to the list of rows
        }

        // Display the raw list of rows
        System.out.println("Raw data (rows):");
        for (ArrayList<Integer> row : rows) {
            System.out.println(row); // Display each row
        }

        // Prompt the user for the number of queries
        System.out.println("Enter the number of queries:");
        int numQueries = scanner.nextInt();

        // Process each query
        for (int i = 0; i < numQueries; i++) {
            System.out.println("Enter query " + (i + 1) + " in the format 'x y' (row and position):");
            int rowIndex = scanner.nextInt(); // Row index (1-based)
            int colIndex = scanner.nextInt(); // Column index (1-based)

            // Check if indices are valid
            if (rowIndex >= 1 && rowIndex <= rows.size() && colIndex >= 1
                    && colIndex <= rows.get(rowIndex - 1).size()) {
                // If valid, print the requested value
                System.out.println("Result: " + rows.get(rowIndex - 1).get(colIndex - 1));
            } else {
                // If invalid, print ERROR!
                System.out.println("Result: ERROR!");
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
