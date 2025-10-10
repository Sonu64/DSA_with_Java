import java.util.Scanner;

public class printOneToN {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n, counter = 1;
        System.out.print("Enter n: ");
        n = in.nextInt();
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
    }
}
