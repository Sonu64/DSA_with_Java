import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        char operator;
        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.print("Enter Operator [+, -, *, /, %]");
        operator = in.next().charAt(0);

        // Switch
        switch(operator) {
            case '+' :
                System.out.println("Sum = " + a+b);
                break;
            case '-' :
                System.out.println("Difference = " + (a-b));
                break;
            case '*' :
                System.out.println("Product = " + a*b);
                break;
            case '/' :
                System.out.println("Quotient = " + a/b);
                break;
            case '%' :
                System.out.println("Remainder = " + a%b);
                break;
            default:
                System.out.println("Invalid Operator !!");


        }
    }
}
