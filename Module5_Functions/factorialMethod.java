import java.util.Scanner;

public class factorialMethod {

    public static int findFactorial(int num) {
        int factorial = 1;
        while (num != 0) {
            factorial *= num;
            num = num - 1;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find factorial: ");
        int num = in.nextInt();
        System.out.printf("Factorial of %d is %d.\n", num, findFactorial(num));
    }
}
