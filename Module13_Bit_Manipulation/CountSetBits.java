import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) count++;
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.printf("Total Set Bits in %d is %d.", num, countSetBits(num));
    }
}
