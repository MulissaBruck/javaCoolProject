import java.util.Scanner;

public class isPrime {
    public static int isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }

        }
        return 1;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Number for prime Number  check :");
        int n = input.nextInt();
        System.out.println(isPrimeNumber(n));

        input.close();

    }
}
