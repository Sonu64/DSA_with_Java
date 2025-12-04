import java.util.Scanner;

public class powerOf2 {
    public static boolean isPowerOf2(int num) {
        if (num == 1) return true;
        if (num <= 0) return false;
        /* My Approach to count total Set Bits in a number, if there is only 1 set bit,
        return true -> It is a power of 2 */
//        int oneCount = 0;
//        while (num != 0) {
//            int lsb = (num & 1);
//            if (lsb == 1) oneCount++;
//            num = num >> 1;
//        }
//        if (oneCount == 1) return true;
//        return false;

        /* Optimal Approach to calculate Bitwise AND of num and num-1. If it is ZERO,
        * num is Power of 2*/
        if ((num & (num-1)) == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(isPowerOf2(num))
            System.out.printf("%d is Power of 2 :) ", num);
        else
            System.out.printf("%d is Not a Power of 2 :( ", num);
    }
}
