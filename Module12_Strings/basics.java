import java.util.*;
public class basics {
    public static void main(String[] args) {
        // Creating Strings
        // in String Constant Pool (SCP)
        String firstName = "Sourakanti";
        String lastName = "Mandal";
        // in General Heap Memory
        String favCoffee = new String("Hazelnut");
        // Convert char array to string
        char[] words = {'H','e','l','l','o'};
        String stringFromCharArray = new String(words);
        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite quote: ");
        String favQuote = in.nextLine();
        // Concatenation and Output
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " likes " + favCoffee + " and his favorite quote is '" + favQuote + "'");
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(1));
    }
}
