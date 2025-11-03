public class AbstractClasses {
    public static void main(String[] args) {
        Car c1 = new Car("Blue");
        System.out.println("Car Color: " + c1.getColor());
    }
}

abstract class Vehicle {
    String color;
    public Vehicle() {
        this.color = "Unspecified Color, Implicitly Parent Constructor " +
                "called and Child Constructor didn't have this.color = passed color.";
        System.out.println("Vehicle Constructor called.");
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
//        this.color = color;
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
