import java.util.Scanner;

public class xPowerN_normal_recursion {
    public static int myPow(int x, int n) {
        if (n == 0)
            return 1;
        return x * myPow(x, n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = in.nextInt();
        System.out.print("Enter N: ");
        int n = in.nextInt();
        System.out.printf("%d ^ %d = %d", x, n, myPow(x, n));
    }
}
