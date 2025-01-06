
// SuperClass definition
class SuperClass {
    // Private method in SuperClass
    private void privateMethod() {
        System.out.println("This is a private method in SuperClass");
    }

    // Public method in SuperClass
    public void publicMethod() {
        System.out.println("This is a public method in SuperClass");
        // Calls the private method in SuperClass
        privateMethod();
    }
}

// SubClass inherits from SuperClass
class SubClass extends SuperClass {
    // Private method in SubClass
    // This is not overriding the SuperClass's private method
    // because private methods are not inherited.
    private void privateMethod() {
        System.out.println("This is a private method in SubClass");
    }

    // Overrides the public method in SuperClass
    @Override
    public void publicMethod() {
        System.out.println("This is a public method in SubClass");
        // Calls the private method in SubClass
        privateMethod();
    }
}

// Test class with the main method
public class overridingPrivate {
    public static void main(String[] args) {
        // Create an instance of SuperClass
        SuperClass obj1 = new SuperClass();
        obj1.publicMethod(); // Calls SuperClass's publicMethod
                             // Output:
                             // This is a public method in SuperClass
                             // This is a private method in SuperClass

        // Create an instance of SubClass
        SubClass obj2 = new SubClass();
        obj2.publicMethod(); // Calls SubClass's overridden publicMethod
                             // Output:
                             // This is a public method in SubClass
                             // This is a private method in SubClass
    }
}
