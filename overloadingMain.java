
public class overloadingMain {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Running main() with no arguments");
        } else if (args.length == 1) {
            try {
                int value = Integer.parseInt(args[0]);
                main(value);
            } catch (NumberFormatException e) {
                main(args[0]);
            }
        } else {
            // Handle more arguments as needed
        }
    }

    public static void main(int value) {
        System.out.println("Running main() with integer argument: " + value);
    }

    public static void main(String message) {
        System.out.println("Running main() with string argument: " + message);
    }
}