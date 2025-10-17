import java.util.Scanner;



public class binToDec {

    public static long convertBinaryToDecimal(long binary) {
        long decimal = 0, lastDigit, power = 0;
        while (binary != 0) {
            lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (long) Math.pow(2.0, (double)power));
            power++;
            binary = binary / 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long binary, decimal;
        System.out.print("Enter Binary Number: ");
        binary = in.nextLong();
        decimal = convertBinaryToDecimal(binary);
        System.out.println("Decimal equivalent of " + binary + " is " + decimal + ". ");
    }
}

