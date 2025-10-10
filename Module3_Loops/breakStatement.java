import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Keep entering non-multiples of 10, Program will never stop ! ");
        int num;
        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();
            if (num % 10 == 0) {
                System.out.println(num + " is a multiple of 10, Stopping Program...");
                break;
            }
            System.out.println(num + " is not a multiple of 10, continuing Program...");
        } while (true);
    }
}
