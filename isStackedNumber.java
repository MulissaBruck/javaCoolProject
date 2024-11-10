import java.util.Scanner;

public class isStackedNumber {

    public static int stackedNumber(int n) {
        int stack = 0;

        for (int i = 1; i <= n; i++) {

            stack = stack + i;
            if (stack == n)
                return 1;
            System.out.println(stack);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter then number Stacked :");
        int number = input.nextInt();

        System.out.println("stacked number for" + number + " is " + stackedNumber(number));
        input.close();
    }

}
