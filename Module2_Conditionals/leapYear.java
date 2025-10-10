import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("Enter year: ");
        year = in.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year !");
        }
        else {
            System.out.println(year + " is not a Leap Year !");
        }
    }
}
