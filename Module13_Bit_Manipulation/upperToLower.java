import java.util.Scanner;

public class upperToLower {
    public static char toLower(char upper) {
        return (char) (upper | ' ');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Uppercase character: ");
        char upper = (in.next()).charAt(0);
        System.out.println("Lowercase of " + upper + " is " + toLower(upper) + ". ");
    }
}
