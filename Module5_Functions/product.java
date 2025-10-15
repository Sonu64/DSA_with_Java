import java.util.Scanner;

public class product {

    public static int findProduct(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st number: ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        System.out.printf("Product of %d and %d is %d\n", num1, num2, findProduct(num1, num2));
    }
}
