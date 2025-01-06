import java.util.*;
import java.security.*;

// Food interface, which defines the getType method that must be implemented by any class that implements it
interface Food {
    public String getType(); // This method will return a description of the food type
}

// Pizza class implements the Food interface and provides its own implementation
// of the getType method
class Pizza implements Food {
    public String getType() {
        // Pizza is categorized as "Fast Food"
        return "Someone ordered a Fast Food!";
    }
}

// Cake class also implements the Food interface and provides its own
// implementation of the getType method
class Cake implements Food {
    public String getType() {
        // Cake is categorized as a "Dessert"
        return "Someone ordered a Dessert!";
    }
}

// FoodFactory class is responsible for creating and returning instances of
// either Pizza or Cake based on the input
class FoodFactory {
    // This method returns an instance of Pizza or Cake based on the order string
    // passed to it
    public Food getFood(String order) {
        // Check if the order is "pizza" (case insensitive)
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza(); // Return a new Pizza object
        }
        // Check if the order is "cake" (case insensitive)
        else if (order.equalsIgnoreCase("cake")) {
            return new Cake(); // Return a new Cake object
        }
        // If the order is neither "pizza" nor "cake", return null (though this
        // shouldn't happen in this case)
        else {
            return null;
        }
    } // End of getFood method
} // End of FoodFactory class

public class foodFactorys {
    public static void main(String args[]) {
        // This line prevents the program from exiting unexpectedly by blocking the exit
        // calls
        Do_Not_Terminate.forbidExit();

        try {
            // Create a scanner object to read input from the user
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter an order, either "pizza" or "cake"
            System.out.println("Please enter your order (pizza/cake):");

            // Create a FoodFactory object to produce the correct food item
            FoodFactory foodFactory = new FoodFactory();

            // Get the food item based on the user's input (either "pizza" or "cake")
            Food food = foodFactory.getFood(sc.nextLine());

            // Output the class of the object returned by the factory
            System.out.println("The factory returned " + food.getClass());

            // Output the type of the food using the getType method of the Food interface
            System.out.println(food.getType());
        }
        // Catching the exception if the program tries to exit unexpectedly due to the
        // Do_Not_Terminate class
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// This class is used to prevent the program from exiting unexpectedly
class Do_Not_Terminate {
    // This exception is thrown if an exit is attempted
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1L;
    }

    // This method sets up a security manager to prevent the program from exiting
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                // If an exit is attempted, throw an ExitTrappedException to prevent termination
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager); // Set the security manager to prevent exit
    }
}
