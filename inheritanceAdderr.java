class Arithmetic {

    int adder(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits adder() method from Arithmetic
}

public class inheritanceAdderr {

    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println(a.adder(3, 4)); // Output: 7
    }
}
