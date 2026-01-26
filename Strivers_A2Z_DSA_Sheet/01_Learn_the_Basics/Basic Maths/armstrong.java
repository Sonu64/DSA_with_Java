// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

import java.util.Scanner;

public static boolean isArmstrong(int num) {
    int temp = num;
    int sum = 0;
    int totalDigits = 0;
    while (num != 0) {
        num /= 10;
        totalDigits++;
    }
    num = temp;
    while(num != 0) {
        int digit = num % 10;
        sum += Math.pow(digit, totalDigits);
        num /= 10;
    }
    if (temp == sum)
        return true;
    else    
        return false;
}

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check for Armstrong: ");
        int num = in.nextInt();
        if (isArmstrong(num))
            System.out.println(num + " is Armstrong :)");
        else
            System.out.println(num + " is not Armstrong.:(");
    }
}
