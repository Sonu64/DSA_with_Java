import java.util.Scanner;

public class stringLength {
    public static int findStringLengthWithIndex(String s, int index) {
        if (s.length() == index)
            return index;
        return findStringLengthWithIndex(s, index+1);
    }

    public static int findStringLengthWithoutIndex(String s) {
        if (s.isEmpty())
            return 0;
        return (1 + findStringLengthWithoutIndex(s.substring(1)));
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = in.nextLine();
        System.out.println("Length of the String is " + findStringLengthWithoutIndex(s));
    }
}
