import java.util.Scanner;

public class isStacked3 {

    public static int isStacked(int n) {
        // Handle the special case where n is 1
        if (n == 1) {
            return 1; // 1 is considered a stacked number (triangular number T_1 = 1)
        }

        int sNum = 1; // Start with the first triangular number
        int i = 2; // Start with the second term

        // Continue calculating triangular numbers until sNum exceeds or equals n
        while (sNum < n) {
            sNum += i; // Add the next integer to the current triangular number
            i++; // Move to the next integer
        }

        // Return 1 if sNum equals n, otherwise return 0
        return (sNum == n) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number for stacked check:");
        int num = input.nextInt();

        System.out.println(isStacked(num));

        input.close();
    }
}
