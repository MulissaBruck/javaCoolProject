// Base Class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

// Driver class
public class Overriding1 { // The class should be public to match filename (Overriding1.java)
    public static void main(String[] args) {
        // If a Parent type reference refers
        // to a Parent object, then Parent's show() is called
        Parent obj1 = new Parent();
        obj1.show(); // Output: Parent's show()

        // If a Parent type reference refers to a Child object,
        // Child's show() is called. This is called RUN TIME POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show(); // Output: Child's show()
    }
}
