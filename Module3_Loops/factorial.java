import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num, copy, factorial = 1;
        System.out.print("Enter number to find factorial: ");
        num = in.nextInt();
        copy = num;

        while (num >= 1) {
            factorial = factorial * num;
            num = num - 1;
        }
        System.out.println("Factorial of " + copy + " is " + factorial + ".");
    }
}
