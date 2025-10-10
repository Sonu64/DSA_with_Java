import java.util.Scanner;

public class oddEven {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num % 2 == 0)
            System.out.printf("%d is Even.", num);
        else
            System.out.printf("%d is Odd.", num);
    }
}
