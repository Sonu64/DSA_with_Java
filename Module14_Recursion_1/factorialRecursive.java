import java.util.Scanner;

public class factorialRecursive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find Factorial: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n) + ".");
    }
}
