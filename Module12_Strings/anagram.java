import java.util.Arrays;
public class anagram {

    private static boolean isAnagram(String s1, String s2) {
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char s1Array[] = s1.toCharArray();
        char s2Array[] = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        String newS1 = new String(s1Array);
        String newS2 = new String(s2Array);

        if (newS1.equals(newS2))
            return true;

        return false;

    }
    public static void main(String[] args) {
        String s1 = "race", s2 = "care";
        if(isAnagram(s1, s2))
            System.out.println("Anagrams !");
        else
            System.out.println("Not Anagrams !");
    }
}
