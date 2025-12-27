import java.util.Scanner;

public class substringsWithStartEndSame {
    static int findSpecialSubstrings(String s, int start, int end) {
        System.out.println("f(" + start + ", " + end + ")");
        int count = 0;
        // Base Cases when length of String is 1 or 0
        if (start >= end) {
            return 0;
        }
        if (end - start == 1) {
            return 1;
        }
        // Fallback Case
        if (s.charAt(start) == s.charAt(end-1))
            count++;
        count = count + findSpecialSubstrings(s, start+1, end) + findSpecialSubstrings(s, start, end-1) - findSpecialSubstrings(s, start+1, end-1);
        return count;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = in.nextLine();
        int count = findSpecialSubstrings(s, 0, s.length());
        System.out.println("Number of req. substrings = " + count + ".");
    }
}
