import java.util.Scanner;

public class First_N_Sum {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int i = 1, sum = 0, n;

        System.out.print("Enter n: ");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers is " + sum + ".");
    }
}
