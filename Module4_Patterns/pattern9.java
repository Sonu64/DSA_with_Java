import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            // Spaces
            for(int spaces=1; spaces<n-i+1; spaces++)
                System.out.print("#");
            // Numbers

            System.out.println();
        }
    }
}
