import java.util.Scanner;

public class sumOfDigits {

    public static int findSumOfDigits(int num) {
        int lastDigit, sum = 0;
        while (num != 0) {
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum;
        System.out.print("Enter number to find sum of digits: ");
        num = in.nextInt();
        sum = findSumOfDigits(num);
        System.out.printf("Sum of the digits of %d is %d.\n", num, sum);
    }
}
