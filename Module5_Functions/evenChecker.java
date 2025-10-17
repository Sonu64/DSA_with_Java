import java.util.Scanner;

public class evenChecker {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        if(isEven(num))
            System.out.println(num + " is an Even number.");
        else
            System.out.println(num + " is not an Even number.");
    }
}
