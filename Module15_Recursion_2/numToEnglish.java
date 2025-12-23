import java.util.Scanner;

public class numToEnglish {

    public static StringBuilder toEnglish(int num, int index, StringBuilder result) {
        String number = Integer.toString(num);
//        System.out.println("result = " + result);
        if (index == number.length()-1) {
            char c = number.charAt(index);
            switch(c) {
                case '0':
                    result.append("Zero");
                    break;
                case '1':
                    result.append("One");
                    break;

                case '2':
                    result.append("Two");
                    break;

                case '3':
                    result.append("Three");
                    break;

                case '4':
                    result.append("Four");
                    break;
                case '5':
                    result.append("Five");
                    break;
                case '6':
                    result.append("Six");
                    break;
                case '7':
                    result.append("Seven");
                    break;
                case '8':
                    result.append("Eight");
                    break;
                case '9':
                    result.append("Nine");
                    break;
                default:
                    break;
            }
            return result;
        }

        else {
            char c = number.charAt(index);
            switch(c) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;

                case '2':
                    result.append("Two ");
                    break;

                case '3':
                    result.append("Three ");
                    break;

                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
                default:
                    break;
            }
            return toEnglish(num, index+1, result);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: (no Zeroes at end): ");
        int num = in.nextInt();
        System.out.print("English representation of " + num + " is ");
        StringBuilder result =  toEnglish(num, 0, new StringBuilder(""));
        System.out.println("'" + result + "'.");
    }
}
