public class compression {

    public static String findCompressedString(String s, int n) {
        Integer count = 1;
        Character lastChar = s.charAt(0);
        StringBuilder c = new StringBuilder("");
        for (int i = 1; i < n; i++) {
            // New Character found and it is NOT Last character of the String.
            if (s.charAt(i) != lastChar && i != n - 1) {
                c.append(lastChar.toString());
                if (count != 1)
                    c.append(count.toString());
                count = 1;
            }
            // Last character reached and is same as previous characters -> Multiple Occurence
            // of Last character 
            else if (i == n - 1 && s.charAt(i) == lastChar) {
                c.append(lastChar.toString());
                count++;
                if (count != 1)
                    c.append(count.toString());
            } 
            // Last character reached and is different from previous characters -> Single Occurence
            // of Last character.
            else if (i == n - 1 && s.charAt(i) != lastChar) {
                c.append(lastChar.toString());
                if (count != 1)
                    c.append(count.toString());
                c.append(s.charAt(i));
            }
            // New Character not found, just increase count of old lastChar, Last character NOT reached 
            else {
                count++;
            }
            lastChar = s.charAt(i);
        }
        String compressedString = c.toString();
        return compressedString;
    }
    public static void main(String[] args) {
        String longString = "aabccddvvv";
        System.out.println(findCompressedString(longString, longString.length()));
    }
}