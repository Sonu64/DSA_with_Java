import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1; i<=n-1; i++) {
            for(int j=1; j<=(n-1)-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
