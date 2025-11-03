public class RuntimePolymorphism {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        _Animal a1 = new _Animal();
        d1.eat();
        a1.eat();
    }
}

class _Animal {
    void eat() {
        System.out.println("Eats Anything.");
    }
}


class Deer extends _Animal {
    void eat() {
        System.out.println("Eats Grass.");
    }
}
