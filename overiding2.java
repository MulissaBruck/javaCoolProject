// Parent class
class Parent {
    // private method cannot be overridden
    private void m1() {
        System.out.println("From parent m1()");
    }

    // protected method can be overridden by child class
    protected void m2() {
        System.out.println("From parent m2()");
    }
}

// Child class inherits from Parent
class Child extends Parent {
    // m1() method unique to the Child class (cannot override Parent's private m1())
    private void m1() {
        System.out.println("From child m1()");
    }

    // Overriding the m2() method from Parent class
    // The child version of m2() has more accessibility (public)
    @Override
    public void m2() {
        System.out.println("From child m2()");
    }
}

// Driver class to test method overriding
public class overiding2 {
    public static void main(String[] args) {
        // Create an instance of Parent class
        Parent obj1 = new Parent();
        obj1.m2(); // This will call the m2() from the Parent class

        // Create an instance of Child class, but reference is of type Parent
        Parent obj2 = new Child();
        obj2.m2(); // This will call the overridden m2() from the Child class
    }
}
