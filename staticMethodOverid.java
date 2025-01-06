// Override of static method
class Parent {

    // static method
    static void show() {
        System.out.println("Parent");
    }
}

// Parent inherit in Child class
class Child extends Parent {

    // override show() of Parent
    /*
     * void show()
     * {
     * System.out.println("Child");
     * }
     */
}

class staticMethodOverid {
    public static void main(String[] args) {
        Parent p = new Parent();
        // calling Parent's show()
        p.show();
        // cannot override Parent's show()
    }
}
