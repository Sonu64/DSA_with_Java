import java.util.Scanner;

public class towersOfHanoi {
    public static void towers_of_hanoi(int n, String source, String destination, String helper) {
        if (n==1)
            System.out.println("Move disk 1 from " + source + " --> " + destination + ".");
        else {

            towers_of_hanoi(n-1, source, helper, destination);
            // n represents Serial number of last disk, No need to call f(n-1) here, just print the required statement.
            System.out.println("Move disk " + (n) + " from " + source + " --> " + destination + ".");
            towers_of_hanoi(n-1, helper, destination, source);
//            System.out.println("Move disk " + n + " from " + source + " --> " + destination + ".");
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Disks (n): ");
        int n = in.nextInt();
        towers_of_hanoi(n, "A", "C", "B");
    }
}
