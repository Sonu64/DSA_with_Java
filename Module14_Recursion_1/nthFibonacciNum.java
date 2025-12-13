import java.util.Scanner;

public class nthFibonacciNum {
    public static int give_Nth_Fibonacci(int n) {
        if (n == 0 ||  n == 1)
            return n;
        else {
            return (give_Nth_Fibonacci(n-1) + give_Nth_Fibonacci(n-2));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();
        System.out.printf("%dth Fibonacci number is %d.", n, give_Nth_Fibonacci(n));
    }
}
