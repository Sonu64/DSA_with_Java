import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Keep on entering numbers, program will skip displaying multiples of 10.");
        System.out.println("Enter -1 to exit program.");
        while(true) {
            System.out.print("Enter number: ");
            num = in.nextInt();
            if (num % 10 == 0)
                continue;
            if (num == -1) {
                System.out.println("-1 entered, exiting program ...");
                break;
            }
            System.out.println(num);
        }
    }
}
