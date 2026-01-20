
import java.util.*;
public class DataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        type = type.toLowerCase();
        switch (type) {
            case "byte":
                System.out.println("1 Byte.");
                break;
            case "character":
            case "char":
            case "short":
                System.out.println("2 Bytes");
                break;
            case "integer":
            case "int":
            case "float":
                System.out.println("4 Bytes.");
                break;
            case "long":
            case "double":
                System.out.println("8 Bytes.");
                break;
            default:
                System.out.println("Invalid Type !");
        }
    }
}
