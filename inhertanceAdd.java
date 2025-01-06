public class inhertanceAdd {

    static class Arithmetic {
        public int adder(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
        // Inherits the adder method from Arithmetic
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.adder(3, 4)); // Expected Output: 7
    }
}
