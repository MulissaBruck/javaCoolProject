import java.util.*;
import java.io.*;

// Base class: BiCycle
class BiCycle {
    // Method to describe a bicycle
    String define_me() {
        return "a vehicle with pedals.";
    }
}

// Derived class: MotorCycle, which extends BiCycle
class MotorCycle extends BiCycle {
    // Overriding the define_me() method to describe a motorcycle
    String define_me() {
        return "a cycle with an engine.";
    }

    // Constructor of the MotorCycle class
    MotorCycle() {
        // Print the overridden method from MotorCycle
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        // Call the method in the superclass using the super keyword
        String temp = super.define_me(); // Calls the method in BiCycle

        // Print the message with the superclass method
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

// Main class: overridingMethod2
public class overridingMethod2 {
    public static void main(String[] args) {
        // Create an instance of MotorCycle
        MotorCycle M = new MotorCycle();

        // Create an instance of BiCycle
        BiCycle B = new BiCycle();
        // Display information about the BiCycle object
        System.out.println("Hello I am a bicycle, I am " + B.define_me());
    }
}
