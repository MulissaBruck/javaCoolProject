import java.util.Scanner;

public class isStacked {

    public static int isStacked(int n) {
        int sum = 0;
        int i = 1;

        while (sum <= n) {
            sum += i;
            i++;
            if (sum == n) {
                return 1; // n is a triangular number
            }
        }
        return 0; // n is not a triangular number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number for stacked check:");
        int num = input.nextInt();

        System.out.println(isStacked(num)); // Output result

        input.close();
    }
}
