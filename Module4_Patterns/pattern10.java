import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            // Spaces
            for(int spaces=1; spaces<n-i+1; spaces++)
                System.out.print("  ");
            // 1 to n
            for(int j=i; j>=1; j--)
                System.out.print(j+" ");
            // 2 to n
            for(int k=2; k<=i; k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}
