public class Intro {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(4);
        System.out.println("Pen Color is " + p1.color + " and Tip Size is " + p1.tip + ". ");
        // Direct Access
        p1.color = "Yellow";
        System.out.println("Pen Color is " + p1.color + " and Tip Size is " + p1.tip + ". ");
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
