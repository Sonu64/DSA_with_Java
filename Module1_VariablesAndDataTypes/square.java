import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        float side = in.nextFloat();
        float area = side * side;
        System.out.println("Area of square with side " + "units is " + area + "units." );
    }
}
