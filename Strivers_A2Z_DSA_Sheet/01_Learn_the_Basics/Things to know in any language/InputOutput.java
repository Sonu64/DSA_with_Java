/*Question Link: https://www.naukri.com/code360/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf%5C&leftPanelTabValue=SUBMISSION */

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(1);
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(0);
        else    
            System.out.println(-1);

    }
}