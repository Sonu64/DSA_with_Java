import java.util.Scanner;

public class ternaryOperator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        // take marks input
        System.out.print("Enter Marks: ");
        int marks = in.nextInt();

        // get Status
        String status = (marks > 33) ? " Passed :) " : " Failed :( ";

        // Display
        System.out.printf("Student %s", status);
    }
}
