import java.util.Scanner;

public class multiplicationTable {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i;
        System.out.print("Enter number to print multiplication table: ");
        num = in.nextInt();
        for(i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
