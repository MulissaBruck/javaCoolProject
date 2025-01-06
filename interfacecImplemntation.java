import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    // Implement the divisor_sum method
    @Override
    public int divisor_sum(int n) {
        int sum = 0;

        // Loop through 1 to n to find the divisors and sum them up
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum; // Return the sum of divisors
    }
}

class interfaceImplemntation { // class main
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);

        // Prompt user to enter a value for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        // Print the sum of divisors
        System.out.print("Sum of divisors: " + my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    // This method prints the name of the interface implemented by the given object
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
