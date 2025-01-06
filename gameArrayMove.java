import java.util.*;

public class gameArrayMove {

    public static boolean canWin(int leap, int[] game) {
        // Create a visited array to keep track of visited indices
        boolean[] visited = new boolean[game.length];
        return canWinHelper(leap, game, 0, visited);
    }

    // Helper function to recursively check if you can win from a given index
    private static boolean canWinHelper(int leap, int[] game, int currentIndex, boolean[] visited) {
        // Base condition: if the current index is out of bounds, return true
        if (currentIndex >= game.length) {
            return true;
        }

        // If we are at an index with value 1, or have already visited it, return false
        if (currentIndex < 0 || game[currentIndex] == 1 || visited[currentIndex]) {
            return false;
        }

        // Mark the current index as visited
        visited[currentIndex] = true;

        // Explore the next steps: move forward, move backward, or leap
        if (canWinHelper(leap, game, currentIndex + 1, visited)) {
            return true;
        }

        if (canWinHelper(leap, game, currentIndex - 1, visited)) {
            return true;
        }

        if (canWinHelper(leap, game, currentIndex + leap, visited)) {
            return true;
        }

        // If no valid move was found, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of queries
        System.out.print("Enter the number of queries (1 to 5000): ");
        int q = getValidInput(scanner, 1, 5000);

        for (int i = 0; i < q; i++) {
            System.out.printf("Query %d:%n", i + 1);

            // Prompt user for the size of the game array and leap size
            System.out.print("Enter the size of the game array (n) and leap size (leap), separated by a space: ");
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            while (n < 1 || leap < 0) {
                System.out.print("Invalid input. Please enter valid n (>= 1) and leap (>= 0): ");
                n = scanner.nextInt();
                leap = scanner.nextInt();
            }

            // Prompt user for the game array
            System.out.println("Enter the game array (space-separated binary values):");
            int[] game = new int[n];
            boolean validInput = false;
            while (!validInput) {
                validInput = true;
                try {
                    for (int j = 0; j < n; j++) {
                        game[j] = scanner.nextInt();
                        if (game[j] != 0 && game[j] != 1) {
                            throw new InputMismatchException("Game array can only contain 0 or 1.");
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Game array should only contain 0s and 1s. Please re-enter:");
                    scanner.nextLine(); // Clear the invalid input
                    validInput = false;
                }
            }

            // Call the canWin function and print the result
            if (canWin(leap, game)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    // Helper function to get valid integer input within a range
    private static int getValidInput(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Please enter a number between %d and %d: ", min, max);
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
