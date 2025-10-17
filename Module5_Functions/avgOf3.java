import java.util.Scanner;

public class avgOf3 {

    public static double findAverage(double a, double b, double c) {
        return ((a+b+c) / 3.0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        double average;
        System.out.print("Enter 1st number: ");
        a = in.nextDouble();
        System.out.print("Enter 2nd number: ");
        b = in.nextDouble();
        System.out.print("Enter 3rd number: ");
        c = in.nextDouble();
        average = findAverage(a, b, c);
        System.out.printf("Average of %.3f, %.3f and %.3f is %.3f.", a, b, c, average);

    }
}
