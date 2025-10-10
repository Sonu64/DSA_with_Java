import java.util.*;
public class incomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Salary amount: ");
        int salary = in.nextInt();
        float tax;

        //Calculate tax
        if (salary < 50000)
            tax =  (float) 0.1 * salary;
        else if (salary >= 50000 && salary <= 100000)
            tax =  (float) 0.2 * salary;
        else
            tax =  (float) 0.3 * salary;

        // Display tax
        System.out.printf("Tax for Salary of Rs.%d is Rs.%.2f.", salary, tax);
    }
}
