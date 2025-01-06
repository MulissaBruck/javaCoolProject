import java.util.*;

public class gameStack {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Start at the first index

        while (!stack.isEmpty()) {
            int currentIndex = stack.pop();

            // If we've moved beyond the last index, we win
            if (currentIndex >= n) {
                return true;
            }

            // Skip if the current index is invalid or already visited
            if (currentIndex < 0 || game[currentIndex] == 1) {
                continue;
            }

            // Mark the current index as visited
            game[currentIndex] = 1;

            // Explore possible moves: forward, backward, or leap
            stack.push(currentIndex + leap); // Leap forward
            stack.push(currentIndex + 1); // Step forward
            stack.push(currentIndex - 1); // Step backward
        }

        // If we've exhausted all options without winning, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            // Input game size and leap size
            System.out.println("Query " + (i + 1) + ":");
            System.out.print("Enter the size of the game array and leap size: ");
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            // Input the game array
            System.out.println("Enter the game array:");
            int[] game = new int[n];
            for (int j = 0; j < n; j++) {
                game[j] = scanner.nextInt();
            }

            // Check if the game can be won and print the result
            if (canWin(leap, game)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
