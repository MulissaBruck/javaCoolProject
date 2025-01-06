import java.util.Scanner;

public class nextLineImportance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer
        int num = scanner.nextInt(); // let's say input is "42"

        // Now try to read a string
        String str = scanner.nextLine(); // This will read the leftover '\n' from previous input

        System.out.println("Integer: " + num);
        System.out.println("String: " + str);

        scanner.close();
    }
}
