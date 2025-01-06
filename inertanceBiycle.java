// Base class
class Bicycle {
    // The Bicycle class has two fields
    public int gear;
    public int speed;

    // The Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // The Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n" + "Speed of bicycle is " + speed);
    }
}

// Derived class
class MountainBike extends Bicycle {

    // The MountainBike subclass adds one more field
    public int seatHeight;

    // The MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
        // Invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // The MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overriding toString() method of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nSeat height is " + seatHeight);
    }
}

// Driver class
public class inertanceBiycle {
    public static void main(String args[]) {
        // Create a MountainBike object with 3 gears, speed 100, and seat height 25
        MountainBike mb = new MountainBike(3, 100, 25);

        // Print the details of the MountainBike object
        System.out.println(mb.toString());
    }
}
