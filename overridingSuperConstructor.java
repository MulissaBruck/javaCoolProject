
// Java Code to show use of 
// super keyword with constructor 

// Superclass Person 
class Person {
    // Constructor of the Person class
    Person() {
        System.out.println("Person class Constructor");
    }
}

// Subclass Student extending the Person class
class Student extends Person {
    // Constructor of the Student class
    Student() {
        // Invokes or calls the parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

// Driver Program
public class overridingSuperConstructor {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student s = new Student();
    }
}
