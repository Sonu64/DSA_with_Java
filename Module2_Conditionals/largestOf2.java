import java.util.Scanner;

public class largestOf2 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int a, b;
        System.out.print("Enter 1st number: ");
        a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        b = in.nextInt();

        if (a > b)
            System.out.printf("%d is greater than %d.", a, b);
        else if (b > a)
            System.out.printf("%d is greater than %d.", b, a);
        else
            System.out.println("Both numbers are equal.");
    }
}
