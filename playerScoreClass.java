import java.util.*;

class Player {
    String name;
    int score;

    // Constructor to initialize the Player object
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Create a class Checker that implements the Comparator interface
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (a.score != b.score) {
            return b.score - a.score; // descending order: higher score first
        }
        // If scores are equal, compare by name alphabetically
        return a.name.compareTo(b.name); // ascending order: alphabetically by name
    }
}

class playerScoreClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask for number of players
        System.out.print("Enter the number of players: ");
        int n = scan.nextInt(); // Number of players
        scan.nextLine(); // Consume the newline character

        Player[] player = new Player[n]; // Array to store Player objects

        Checker checker = new Checker(); // Create an instance of Checker to use for sorting

        // Ask for player data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name and score (separated by space): ");
            String name = scan.next();
            int score = scan.nextInt();
            player[i] = new Player(name, score); // Read name and score
        }
        scan.close();

        // Sort players using the custom comparator (Checker)
        Arrays.sort(player, checker);

        // Output the sorted players
        System.out.println("Sorted players:");
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %d\n", player[i].name, player[i].score);
        }
    }
}
