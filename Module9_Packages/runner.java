/* runner is the container for main class which will run actually,
it is usually put outside of any package.
In order for runner to use other classes in a package, it should import the package
and those classes must be public to allow inter-pkg access. default will not work as it
is pkg-private visibility. */

/* import tools.* imports all the files, and not folders within. for that we use
 import tools.FOLDER/PKG.className or tools.FOLDER/PKG.*     */


//import tools.Calc;
import tools.AdvCalc;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        AdvCalc myAdvCalc = new AdvCalc();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();

        // All the methods should be public to allow inter-pkg access
        System.out.println("Sum = " + myAdvCalc.add(a, b));
        System.out.println("Difference = " + myAdvCalc.subtract(a, b));
        System.out.println("Product = " + myAdvCalc.multiply(a, b));
        System.out.println("Integer Quotient = " + myAdvCalc.divide(a, b));
        // Error, showTest must be public to access outside pkg
        myAdvCalc.showTest();
    }
}
