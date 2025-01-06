// Person Class with Encapsulation
class Person {
    // Encapsulating the name and age fields
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

// Main Class
public class encapsulation {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();

        // Setting values for name and age
        person.setName("John");
        person.setAge(30);

        // Trying to set invalid values
        person.setName(""); // Invalid name
        person.setAge(-5); // Invalid age

        // Using getter methods to get values and print
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
