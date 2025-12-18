public class removeDuplicatesFromString {
    public static StringBuilder removeDuplicates(StringBuilder s, int n, boolean[] letters) {
        StringBuilder uniqueString = new StringBuilder("");
        int index = s.length() - n;
        Character currentChar = s.charAt(index);
        if (index == s.length() - 1) {
            if ( ! letters[currentChar - 97]) {
                uniqueString.append(currentChar);
            }
            return uniqueString;
        }

        else {
            if ( ! letters[currentChar - 97]) {
                uniqueString.append(currentChar);
                letters[currentChar - 97] = true;
            }
            uniqueString.append( removeDuplicates(s, n-1, letters) );
            return uniqueString;
        }
    }

    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder("abssabbccddczzxxmooppfrfr");
        boolean letters[] = new boolean[26];
        for(int i=0; i<26; i++) {
            letters[i] = false;
        }
        myString = removeDuplicates(myString, myString.length(), letters);
        System.out.println(myString);
    }
}
