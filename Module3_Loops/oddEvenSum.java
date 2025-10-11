import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, oddSum = 0, evenSum = 0, choice = 1;

        while (choice == 1) {
            System.out.print("Enter number: ");
            num = in.nextInt();
            if(num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
            System.out.print("Do you want to continue ? [1 to continue, anything else to stop]: ");
            choice = in.nextInt();
        }
        System.out.println("Sum of Even Numbers entered = " + evenSum);
        System.out.println("Sum of Odd Numbers entered = " + oddSum);
    }
}
