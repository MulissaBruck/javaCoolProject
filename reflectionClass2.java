import java.lang.reflect.Method; // Import the reflection Method class
import java.util.ArrayList; // Import ArrayList for storing method names
import java.util.Collections; // Import Collections for sorting

public class reflectionClass2 {
    public static void main(String[] args) {
        // Get the class object for Student
        Class<Student> studentClass = Student.class;

        // Retrieve all the declared methods of the Student class
        Method[] methods = studentClass.getDeclaredMethods();

        // Create an ArrayList to store the method names
        ArrayList<String> methodList = new ArrayList<>();

        // Iterate over the methods array
        for (Method method : methods) {
            // Add each method name to the ArrayList
            methodList.add(method.getName());
        }

        // Sort the method names alphabetically
        Collections.sort(methodList);

        // Print each method name in alphabetical order
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}

// A sample Student class for demonstration
class Student {
    private String name; // A private field for the student's name
    private String id; // A private field for the student's ID
    private String email; // A private field for the student's email
    private double cgpa; // A private field for the student's CGPA

    // A public getter method for the name
    public String getName() {
        return name;
    }

    // A public setter method for the ID
    public void setId(String id) {
        this.id = id;
    }

    // A public setter method for the email
    public void setEmail(String email) {
        this.email = email;
    }

    // A public getter method for the CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Another sample public method
    public void anothermethod() {
        // This method does nothing but exists for reflection
    }

    // Additional methods could exist here
}
