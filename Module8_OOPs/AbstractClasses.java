public class AbstractClasses {
    public static void main(String[] args) {
        Car c1 = new Car("Blue");
        System.out.println("Car Color: " + c1.getColor());
    }
}

abstract class Vehicle {
    String color;

    // No-arg constructor, must be present if Child implicitly calls super()
    public Vehicle() {
        this.color = "DEFAULT COLOR SET BY VEHICLE's NO-ARG CONSTRUCTOR ";
        System.out.println("Vehicle No-Arg Constructor (Implicit) called.");
    }

    // Parameterized Constructor
    public Vehicle(String color) {
        this.color = color;
        System.out.println("Vehicle Parameterized Constructor called (NOT USED).");
    }

    // Concrete Method
    void move() {
        
        System.out.println("Vehicle Moves...");
    }

    // Abstract Method
    abstract void engineType();
}

class Car extends Vehicle {
    public Car(String color) {
        // NO EXPLICIT super() CALL HERE.
        // The Java compiler silently inserts: super();
        // This calls the Vehicle() (no-arg) constructor above.
        // We are not doing this.color = color, so color passed to Car constructor will be ignored

        // Explicit call to Parent constructor, parameterized version
        // super("Red");

        // this.color = color;

        System.out.println("Car constructor called.");
    }

    // Implementing Abstract method
    void engineType() {
        System.out.println("A Car has a Normal Power Engine.");
    }

    // color getter
    String getColor() {
        return this.color;
    }
}
