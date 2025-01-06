public class isFactorialSum {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void findFactorialSums(int limit) {
        boolean found = false;
        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit; j++) { // Start j from i to avoid duplicate pairs
                if (factorial(i) + factorial(j) == factorial(limit)) {
                    System.out.println("First factorial num: " + i);
                    System.out.println("Second factorial num: " + j);
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        if (!found) {
            System.out.println("There are no numbers whose factorials sum to " + limit + "!");
        }
    }

    public static void main(String[] args) {
        findFactorialSums(3); // Finding two numbers whose factorials sum up to 10!
    }
}
