public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish bluegill = new Fish();
        bluegill.eat();
        bluegill.breathe();
        bluegill.fins = 2;
        bluegill.swim();
        System.out.println("Fish object has " + bluegill.fins + " Fins.");
    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("Eats !");
    }
    void breathe() {
        System.out.println("Breathes !");
    }
}

class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swims in water :) ");
    }
}