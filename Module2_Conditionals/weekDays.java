import java.util.Scanner;

public class weekDays {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int weekIndex;
        System.out.print("Enter Day number [1-7]: ");
        weekIndex = in.nextInt();

        switch(weekIndex) {
            case 1:
                System.out.println("Day number 1 is Monday.");
                break;
            case 2:
                System.out.println("Day number 2 is Tuesday.");
                break;
            case 3:
                System.out.println("Day number 3 is Wednesday.");
                break;
            case 4:
                System.out.println("Day number 4 is Thursday.");
                break;
            case 5:
                System.out.println("Day number 5 is Friday.");
                break;
            case 6:
                System.out.println("Day number 6 is Saturday.");
                break;
            case 7:
                System.out.println("Day number 7 is Sunday.");
                break;
            default:
                System.out.println("Invalid Day Number !!");
        }
    }
}
