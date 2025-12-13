import java.util.Scanner;

public class sumOfNnums {
    public static int sum_Of_N_numbers(int n) {
        if(n == 1)
            return 1;
        else {
            return n + sum_Of_N_numbers(n-1);
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();
        System.out.printf("Sum of first %d Natural numbers is %d. ", n, sum_Of_N_numbers(n));
    }
}
