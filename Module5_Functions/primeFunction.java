import java.util.Scanner;

public class primeFunction {

    public static boolean isPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter number to check Prime: ");
        num = in.nextInt();

        if (num == 1)
            System.out.println("1 is neither Prime nor Composite !");
        else {
            if (isPrime(num))
                System.out.println(num + " is a Prime number.");
            else
                System.out.println(num + " is a Composite number.");
        }
    }
}
