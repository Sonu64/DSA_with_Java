import java.util.Scanner;

public class numToEnglish {

    public static StringBuilder toEnglish(int num, StringBuilder result) {
        String words[] = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
//        System.out.println(result);
        if (num == 0 && result.isEmpty()) {
            return new StringBuilder("Zero ");
        }
        else if (num == 0 && !result.isEmpty()) {
            result.append("Zero ");
        }
        int lastDigit = num % 10;
        result.append(words[lastDigit]);
        result = toEnglish(num / 10, result);
        return result;
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: (no Zeroes at end): ");
        int num = in.nextInt();
        System.out.print("English representation of " + num + " is ");
        StringBuilder result =  toEnglish(num, new StringBuilder(""));
        System.out.println("'" + result + "'.");
    }
}
