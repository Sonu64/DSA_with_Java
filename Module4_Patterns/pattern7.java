import java.util.Scanner;

public class pattern7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            //spaces
            for(int spaces=1; spaces<=i-1; spaces++)
                System.out.print(" ");
            //stars
            for(int j=n; j>=i; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
