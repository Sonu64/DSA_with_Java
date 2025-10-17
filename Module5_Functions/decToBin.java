import java.util.Scanner;

public class decToBin {

    public static long convertDecimalToBinary(long decimal) {
        long remainder, binary = 0, power = 0;
        while (decimal != 0) {
            remainder = decimal % 2;
            binary += remainder * (long)Math.pow(10.0, (double)power);
            power++;
            decimal /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long decimal, binary;
        System.out.print("Enter Decimal to find Binary: ");
        decimal = in.nextLong();
        binary = convertDecimalToBinary(decimal);
        System.out.println("Binary equivalent of "+decimal+" is "+binary+". ");
    }
}
