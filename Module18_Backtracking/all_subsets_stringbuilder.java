import java.util.Scanner;

public class all_subsets_stringbuilder {

    // Global variable to keep track of the index in results array
    static int count = 0;

    public static void showAllSubsets(StringBuilder[] results, String original, StringBuilder ans, int i) {
        // when i == original.length(), you have made a decision for every character.
        // You aren't "appending previous results"; you are capturing the final state of
        // one complete branch of the tree.
        if (i == original.length()) {
            if (ans.toString().isEmpty()) {
                // System.out.print("null ");
                results[count++] = new StringBuilder("null");
            } else {
                // System.out.print(ans+" ");
                results[count++] = new StringBuilder(ans.toString());
            }
            return;
        }

        // Recursive Step1 --> Followed by Backtracking Step and then another recursive path
        // If we decide to Put the character into the ans
        showAllSubsets(results, original, ans.append(original.charAt(i)), i + 1); // append to END
        ans.deleteCharAt(ans.length() - 1); // Backtrack -> Remove from END
        showAllSubsets(results, original, ans, i + 1); // Take the NO path.

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String to find all Subsets: ");
        String inputString = in.nextLine();
        StringBuilder s = new StringBuilder("");
        StringBuilder[] results = new StringBuilder[(int)Math.pow(2, inputString.length())];
        if (results.length==1) // 2^0==1
            System.out.print("Only 1 subset of Empty String" + inputString + " is ---> ");
        else
            System.out.print("All Subsets of " + inputString + " are ---> ");
        showAllSubsets(results, inputString, s, 0);
        for (int i = 0; i < results.length; i++) {
            if (i != results.length-1)
                System.out.print(results[i] + ", ");
            else
                System.out.print(results[i]);
        }
    }
}