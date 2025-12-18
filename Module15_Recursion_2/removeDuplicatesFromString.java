public class removeDuplicatesFromString {
    public static StringBuilder removeDuplicates(StringBuilder s, int n) {
        StringBuilder uniqueString = new StringBuilder("");
        int index = n - 1;
        char currentChar = s.charAt(index);

        // Base case for Single Character String
        if (index == 0) {
            uniqueString.append(s.charAt(index));
            return uniqueString;
        }

        // Global Case
//        for (int i = 0; i <= index; i++) {
//            if (s.charAt(i) == currentChar) {
//                s.delete(i, i+1);
//            }
//        }
       return uniqueString.append(uniqueString.append(removeDuplicates(s, n-1)));

    }

    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder("ssoonunuu");
        myString = removeDuplicates(myString, myString.length());
        System.out.println(myString);
    }
}
