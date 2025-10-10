import java.util.Scanner;

public class fever {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double temp;
        System.out.print("Enter temperature: ");
        temp = in.nextDouble();
        if (temp >= 100.0)
            System.out.println("You have fever ! Please take action !");
        else if (temp > 98.6 && temp < 100.0)
            System.out.println("You have slight raised temperature ! Keep an eye !");
        else if (temp <= 98.6 && temp >= 95.0)
            System.out.println("Your temperature seems normal !");
        else
            System.out.println("Your temperature feels really Low ! You should keep an eye on any symptoms !");
    }
}
