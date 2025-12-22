import java.util.Scanner;

public class binaryStrings {
    public static void binary_strings(int n, String result) {
        if (result.equals("")) {
            binary_strings(n, "0");
            binary_strings(n, "1");
        }
        else if (n == 1)
            System.out.print(result + " ");
        else {
            if (result.charAt(result.length()-1) == '0') {
                // result is a String, not StringBuilder, so its Actual value never gets changed
                binary_strings(n-1, result + "0");
                binary_strings(n-1, result + "1");
            }
            else {
                binary_strings(n-1, result + "0");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = in.nextInt();
        System.out.println("All Binary Strings of length N, without consecutive Ones are - ");

        binary_strings(n, "");
    }
}
