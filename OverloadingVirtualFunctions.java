// Parent class
class Parent {

    // Method in the parent class
    void display() {
        System.out.println("This is the Parent class method.");
    }
}

// Subclass 1 overriding the display method
class Child1 extends Parent {

    // Using @Override to indicate this method overrides the parent method
    @Override
    void display() {
        System.out.println("This is the Child1 class method.");
    }
}

// Subclass 2 overriding the display method
class Child2 extends Parent {

    // Using @Override to indicate this method overrides the parent method
    @Override
    void display() {
        System.out.println("This is the Child2 class method.");
    }
}

// Main class to test the behavior OverrideExample
public class OverloadingVirtualFunctions {

    public static void main(String[] args) {
        // Reference of Parent class pointing to Child1 object
        Parent obj1 = new Child1();
        obj1.display(); // Calls Child1's overridden method

        // Reference of Parent class pointing to Child2 object
        Parent obj2 = new Child2();
        obj2.display(); // Calls Child2's overridden method

        // Reference of Parent class calling Parent's original method
        Parent obj3 = new Parent();
        obj3.display(); // Calls Parent's original method
    }
}
