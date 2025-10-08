import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter 3 number one-by-one: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double avg = (a+b+c) / 3.0;
        System.out.println("Average is " + avg);
    }
}
