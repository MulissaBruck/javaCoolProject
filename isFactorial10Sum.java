public class isFactorial10Sum {

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;

        }
        // System.out.println(fact);
        return fact;

    }

    public static void findFactorialSums(int limit) {
        for (int i = 1, j = 1; i <= limit; i++, j++) {

            if (factorial(i) + factorial(j) == factorial(limit)) {
                System.out.println(" First factorial num :" + i);
                System.out.println(" Second factorial num :" + j);
                break;
            } else
                System.out.println(" there is no numbers");

        }

    }

    public static void main(String[] args) {

        findFactorialSums(1);
        // System.out.println("Factorial of : " + factorial(1));
    }

}
