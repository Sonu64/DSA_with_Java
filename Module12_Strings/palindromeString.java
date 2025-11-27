public class palindromeString {
    public static boolean isPalindrome(String word, int n) {
        boolean palindrome = false;
        String actualString = word;
        char[] wordArray = word.toCharArray();
        for(int i = 0;  i <= (n/2); i++) {
            char temp = wordArray[i];
            wordArray[i] = wordArray[n-i-1];
            wordArray[n-i-1] = temp;
        }
        String reversedString = new String(wordArray);
        if (reversedString.equals(actualString))
            return true;
//        System.out.println(reversedString);
//        System.out.println(actualString);
        return false;
    }
    public static boolean differentIsPalindrome(String word, int n) {
        for (int i=0; i<=(n/2); i++) {
            if (word.charAt(i)==' ' || word.charAt(n-i-1)==' ') continue;
            if (word.charAt(i) != word.charAt(n-i-1))
                return false;
        }
        return true;
    }

    public static void main (String[] args) {
        String word = "A race car A";
        if (isPalindrome(word, word.length()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        if (differentIsPalindrome(word, word.length()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
