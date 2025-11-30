import java.util.Scanner;

public class vowels {
    private static int countVowels(String s, int n) {
        int count = 0;
        for (int i=0; i<n; i++) {
            char currChar = s.charAt(i);
            if (currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sen = in.nextLine();
        System.out.println("Number of vowels is " + countVowels(sen, sen.length()));
    }
}
