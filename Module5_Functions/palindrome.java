import java.util.Scanner;

public class palindrome {

    public static int reverseNumber(int num) {
        int revNum = 0, remainder;
        while (num != 0) {
            remainder = num % 10;
            revNum = (revNum * 10) + remainder;
            num /= 10;
        }
        return revNum;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter number to check Palindrome: ");
        num = in.nextInt();
        if (isPalindrome(num))
            System.out.printf("%d is a Palindrome number. \n", num);
        else
            System.out.printf("%d is Not a Palindrome number. \n", num);
    }
}
