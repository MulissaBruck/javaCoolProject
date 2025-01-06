// Car Class with Encapsulation
class Car {
    // Encapsulating the model, color, and price fields
    private String model;
    private String color;
    private double price;

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Invalid model.");
        }
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Invalid color.");
        }
    }

    // Getter and Setter for price with validation
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
}

// Main Class
public class encapsulationCar {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car();

        // Setting valid values for model, color, and price
        car.setModel("Toyota");
        car.setColor("Red");
        car.setPrice(25000);

        // Trying to set invalid values
        car.setModel(""); // Invalid model
        car.setColor(""); // Invalid color
        car.setPrice(-5000); // Invalid price

        // Using getter methods to get values and print
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Color: " + car.getColor());
        System.out.println("Car Price: $" + car.getPrice());
    }
}
