import java.util.Scanner;

public class xPowerN_optimized {

    public static int optimizedPow(int x, int n) {
        // Even
        if (n % 2 == 0) {
            if (n==0) return x;
            return x*optimizedPow(x, n/2);
        }
        // Odd
        else {
            return 1;
        }
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
