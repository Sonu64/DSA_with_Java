public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.breed = "German Shephard";
        puppy.legs = 4;
        puppy.color = "Brown";
        puppy.showDetails();
        puppy.eat();
        puppy.breathe();
    }
}

class BaseAnimal {
    String color;
    void eat() {
        System.out.println("Eats !");
    }
    void breathe() {
        System.out.println("Breathes !");
    }
}

class Mammal extends BaseAnimal {
    int legs;
}

class Dog extends Mammal {
    String breed;
    public void showDetails() {
        System.out.println("Dog Details :-\nLegs: " + this.legs + "\nBreed: " + this.breed + "\nColor: " + this.color);
    }
}
