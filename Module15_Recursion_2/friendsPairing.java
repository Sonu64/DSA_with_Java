import java.util.Scanner;

public class friendsPairing {
    public static int pair(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int singleChoices = pair(n-1);
            // 1 choice to choose OneSelf from n options, n-1 friends remain

            int pairedChoices = (n-1) * pair(n-2);
            // 1 choice to choose OneSelf and (n-1) choices to choose whom to pair up with
            // from n-1 options. n-2 friends remain.

            return singleChoices + pairedChoices;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of friends (N): ");
        int n = in.nextInt();
        System.out.println("Total Ways to Pair up or stay Single: " + pair(n));
    }
}
