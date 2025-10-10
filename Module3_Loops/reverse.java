import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, rem, revNum = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        while (num > 0) {
            rem = num % 10;
            revNum = (revNum * 10) +  rem;
            num = num / 10;
        }
        System.out.println("Reversed number is " + revNum + ". ");
    }
}
