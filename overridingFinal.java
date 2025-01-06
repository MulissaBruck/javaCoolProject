// Parent class with a final method
class Parent {
    // final method: cannot be overridden by subclasses
    final void show() {
        System.out.println("Parent's show method");
    }
}

// Child class trying to override the final method from Parent
class Child extends Parent {
    // This will cause a compilation error because the show() method is final in the
    // Parent class
    /*
     * void show() {
     * System.out.println("Child's show method");
     * }
     */
}

public class overridingFinal {
    public static void main(String[] args) {
        // Create an instance of the Parent class and call the show() method
        Parent parent = new Parent();
        parent.show(); // This will print "Parent's show method"

        // Create an instance of the Child class and call the show() method
        // The code will not compile because show() is final in the Parent class
        // Child child = new Child();
        // child.show(); // This line would cause a compilation error
    }
}
