import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i;
        boolean isPrime = true;

        System.out.print("Enter a number to check for Prime: ");
        num = in.nextInt();

        for(i = 2; i < num/2; i++) { //Checking upto Math.sqrt(num) is also fine.
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number !");
        }
        else {
            System.out.println(num + " is not a Prime number !");
        }
    }
}
