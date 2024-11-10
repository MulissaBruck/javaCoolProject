import java.util.Scanner;

public class sumOfFactors {

    public static int sumOfFactors(int n) {

        int sumFact = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sumFact = sumFact + i;
                System.err.println(i);
            }

        }
        System.out.println(sumFact);

        return sumFact == n ? sumFact : 0;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        // Output the sum of factors
        System.out.println("The sum of factors: " + sumOfFactors(n));
        input.close();
    }

}
