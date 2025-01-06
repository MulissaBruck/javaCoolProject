import java.util.Scanner;

public class stringIntegerFormating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print the top border line
        System.out.println("================================");

        // Loop to read the input and format the output
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();

            // Print formatted output for each line
            System.out.printf("%-15s%03d\n", str, num);
        }

        // Print the bottom border line
        System.out.println("================================");

        sc.close();
    }
}
