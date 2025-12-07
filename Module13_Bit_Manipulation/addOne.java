import java.util.Scanner;

public class addOne {
    public static int add1(int num) {
        return (-(~num));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.printf("%d + 1 = %d\n", num, add1(num));
    }
}
