public class superKeyword {
    public static void main(String[] args) {
        WoodenPencil p1 = new WoodenPencil();
        System.out.println(p1.color + " " + p1.tip);
    }
}

class Pencil {
    String color;
    String tip;
    Pencil() {
        System.out.println("Pencil Constructor called.");
    }
    // If there is explicit super call, then this Arged constructor will run, unless we do super() only
    Pencil(String color) {
        System.out.println("Arged Pencil Constructor called, using super(" +
                ")");
        this.color = color;
    }
}

class WoodenPencil extends Pencil {
    WoodenPencil() {
        // By default also super() called if Explicit call to super(<PARAM>) isn't given
        super("Yellow"); // Now the Non-Arg constructor will not run
        System.out.println("Wooden Pencil Constructor called.");
        super.tip = "Sharp"; // Either do this or make a Parameterized Parent constructor
    }
}
