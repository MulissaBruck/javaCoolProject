// Parent class
class Parent {
    // Static method in the base class
    // which will be hidden in the subclass
    static void m1() {
        System.out.println("From parent static m1()");
    }

    // Non-static method which will be overridden in derived class
    void m2() {
        System.out.println("From parent non-static (instance) m2()");
    }
}

// Child class inherits from Parent
class Child extends Parent {
    // This method hides m1() in Parent (does not override)
    static void m1() {
        System.out.println("From child static m1()");
    }

    // This method overrides m2() in Parent
    @Override
    public void m2() {
        System.out.println("From child non-static (instance) m2()");
    }
}

// Driver class
public class overridingStatic {
    public static void main(String[] args) {
        // Parent reference but pointing to a Child object
        Parent obj1 = new Child();

        // Static methods are resolved at compile-time,
        // so this calls the Parent class's m1() (method hiding)
        obj1.m1(); // Output: From parent static m1()

        // Non-static methods are resolved at runtime,
        // so this calls the Child class's m2() (method overriding)
        obj1.m2(); // Output: From child non-static (instance) m2()
    }
}
