public class allSubsetsOfString {

    public static void findAllSubsets(String s, String ans, int i) {
        //Base case
        if (i == s.length()) {
            if (ans.length() == 0)
                System.out.print("null");
            else
                System.out.print(ans + " ");
            return;
        }
        // Recursive Steps
        // 1st choice ===> Character GOES TO Subset
        findAllSubsets(s, ans+s.charAt(i), i+1);
        // 2nd choice ===> Character DOES NOT GO TO Subset, but we increment i in next call
        findAllSubsets(s, ans, i+1);

    }

    public static void main(String[] args) {
        String s = "abc";
        findAllSubsets(s, "", 0);
    }
}
