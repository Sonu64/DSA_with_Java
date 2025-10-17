import java.util.Scanner;

public class primesInRange {

    public static boolean isPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n to find all Prime numbers between 2 to n: ");
        n = in.nextInt();
        System.out.printf("Prime numbers from 2 to %d are - \n", n);
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }
}
