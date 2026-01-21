// https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

import java.util.*;

public class forLoops {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int tempSum = 0, a, b;

        if (n == 1) 
            System.out.println(0);

        else if (n == 2 || n == 3)
            System.out.println(1);

        else {
            a = 1;
            b = 1;
            for (int i = 4; i <= n; i++) {
                tempSum = a + b;
                a = b; // This is f(n-2)
                b = tempSum; // This is f(n-1)
            }
            System.out.println(tempSum);

        }
    }

}