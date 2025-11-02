public class HierarchialInheritance {
    public static void main(String[] args) {

        Fish_ bluegill = new Fish_();
        bluegill.color = "Blue";
        System.out.println("Bluegill color is " + bluegill.color);
        bluegill.eat();
        bluegill.breathe();
        bluegill.swim();

        Bird parrot = new Bird();
        parrot.color = "Green";
        System.out.println("\nParrot color is " + parrot.color);
        parrot.eat();
        parrot.breathe();
        parrot.fly();
    }
}


class AnimalBase {
    String color;
    void eat() {
        System.out.println("Eats !");
    }
    void breathe() {
        System.out.println("Breathes !");
    }
}

class Fish_ extends AnimalBase { // underscore only to avoid duplications
    void swim() {
        System.out.println("Swimming in water.");
    }
}

class Bird extends AnimalBase {
    void fly() {
        System.out.println("Flying in Sky.");
    }
}