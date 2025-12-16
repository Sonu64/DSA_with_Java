import java.util.Scanner;

public class xPowerN_optimized {

    public static int optimizedPow(int x, int n) {

        // Base Case
        if (n == 0) return 1;

        int halfPower = optimizedPow(x, n/2);
        // Even
        if (n % 2 == 0) return (halfPower * halfPower);
        // Odd
        else return (x * halfPower * halfPower);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = in.nextInt();
        System.out.print("Enter N: ");
        int n = in.nextInt();
        System.out.printf("%d ^ %d = %d", x, n, optimizedPow(x, n));
    }
}
