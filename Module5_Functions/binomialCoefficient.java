import java.util.Scanner;

public class binomialCoefficient {

    public static int factorial(int num) {
        int factorial = 1;
        while (num != 0) {
            factorial *= num;
            num--;
        }
        return factorial;
    }

    public static int findBinomialCoefficient(int n, int r) {
        int binomialCoefficient = (factorial(n) / (factorial(r) * factorial(n-r)));
        return binomialCoefficient;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, binomialCoefficient;
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter r: ");
        r = in.nextInt();
        binomialCoefficient = findBinomialCoefficient(n, r);
        System.out.printf("Binomial Coefficient of %d and %d is %d.\n", n, r, binomialCoefficient);
    }
}
