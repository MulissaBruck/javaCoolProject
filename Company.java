// Abstract class representing a Person
abstract class Person {
    // Common attributes for all people
    String name;
    int age;

    // Constructor to initialize the common attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to print information, each subclass must implement this
    abstract void printInfo();
}

// Concrete class representing an Employee, extending Person
class Employee extends Person {
    // Additional attributes for Employee
    int employeeId;
    float salary;

    // Constructor to initialize employee-specific attributes
    Employee(String name, int age, int employeeId, float salary) {
        super(name, age); // Call the constructor of the superclass (Person)
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Implementing the abstract method to print employee details
    @Override
    void printInfo() {
        // Printing the details of the employee
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to run the program
public class Company {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 30, 1001, 75000.5F);

        // Call the printInfo() method to display employee details
        emp.printInfo();
    }
}
