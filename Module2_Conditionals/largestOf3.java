import java.util.Scanner;

public class largestOf3 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a >= b && a >= c)
            System.out.println(a + " is largest !");
        else if (b >= a && b >= c)
            System.out.println(b + " is largest !");
        else if (c >= a && c >= b)
            System.out.println(c + " is largest !");
        if (a==b && b==c && a==c)
            System.out.println("All are Equal !");
    }
}
