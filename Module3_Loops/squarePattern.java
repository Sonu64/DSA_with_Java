import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows, i, j;
        System.out.print("Enter number of Rows in square: ");
        rows = in.nextInt();
        for(i=1; i<=rows; i++) {
            for(j=1; j<=rows; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
