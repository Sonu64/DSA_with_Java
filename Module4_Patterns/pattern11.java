import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        /* Upper Pyramid */
        for(int i=1; i<=n; i++) {

            // Spaces
            for(int spaces=1; spaces<n-i+1; spaces++)
                System.out.print("  ");
            // i to 1
            for(int j=i; j>=1; j--)
                System.out.print(j+" ");
            // 2 to i
            for(int k=2; k<=i; k++)
                System.out.print(k+" ");
            System.out.println();
        }

        /* Lower Pyramid */
        for(int i=1; i<=n-1; i++) {
            // Spaces
            for(int spaces=1; spaces<=i; spaces++)
                System.out.print("  ");
            // n-i to 1
            for(int j=n-i; j>=1; j--)
                System.out.print(j+" ");
            // 2 to n-i
            for(int k=2; k<=n-i; k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}
