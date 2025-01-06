class Animal {
    void walk() {
        System.out.println("I am walking"); // Method inherited by Bird
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying"); // Unique to Bird
    }

    void sing() {
        System.out.println("I am singing"); // Newly added method
    }
}

public class inheritanceBird {
    public static void main(String[] args) {
        Bird bird = new Bird(); // Create an object of Bird class
        bird.walk(); // Inherited method from Animal
        bird.fly(); // Bird-specific method
        bird.sing(); // Newly added method
    }
}
