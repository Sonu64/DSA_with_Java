import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        // Upper Pyramid
        for(int i=1; i<=n; i++) {
            //spaces
            for(int spaces=1; spaces<n-i+1; spaces++)
                System.out.print(" ");
            //stars
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }

     }
}
