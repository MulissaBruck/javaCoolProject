import java.lang.reflect.*; // Import reflection classes to inspect methods of a class
import java.util.*; // Import utility classes for ArrayList and Collections

public class reflectionClass {

    public static void main(String[] args) {
        // Step 1: Get the Class object of the Student class
        Class<?> studentClass = Student.class;
        // `Student.class` provides metadata about the `Student` class.

        // Step 2: Retrieve all declared methods of the Student class
        Method[] methods = studentClass.getDeclaredMethods();
        // Retrieves all methods declared in the `Student` class,
        // including public, private, and protected methods.

        // Step 3: Create a list to store method names
        ArrayList<String> methodList = new ArrayList<>();

        // Step 4: Iterate over the methods array to extract method names
        for (Method method : methods) {
            methodList.add(method.getName());
            // Add each method's name (as a string) to the list.
        }

        // Step 5: Sort the method names alphabetically
        Collections.sort(methodList);

        // Step 6: Print each method name
        for (String name : methodList) {
            System.out.println(name);
            // Print each method name in alphabetical order.
        }
    }
}

// Hypothetical Student class for demonstration
class Student {
    // Private fields of the Student class
    private String name; // A private field to store the student's name.
    private String id; // A private field to store the student's ID.
    private String email; // A private field to store the student's email address.

    // Public getter method for the `name` field
    public String getName() {
        return name;
        // This method allows external code to retrieve the value of the `name` field.
    }

    // Public setter method for the `id` field
    public void setId(String id) {
        this.id = id;
        // This method allows external code to set the value of the `id` field.
    }

    // Public setter method for the `email` field
    public void setEmail(String email) {
        this.email = email;
        // This method allows external code to set the value of the `email` field.
    }

    // An additional public method with no functionality
    public void anothermethod() {
        // This is just a placeholder method for demonstration.
    }

    // Note:
    // 1. There is no `setName` method for the `name` field, meaning `name` cannot
    // be modified externally.
    // 2. There are no `getId` or `getEmail` methods for `id` and `email`, meaning
    // their values cannot be retrieved once set.
}
