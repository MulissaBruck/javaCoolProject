import java.util.Scanner;

public class nextLineImportance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer
        int num = scanner.nextInt(); // let's say input is "42"

        // Use nextLine() to consume the leftover newline
        scanner.nextLine(); // This consumes the '\n' character

        // Now read the string correctly
        String str = scanner.nextLine(); // This reads the string input

        System.out.println("Integer: " + num);
        System.out.println("String: " + str);

        scanner.close();
    }
}
