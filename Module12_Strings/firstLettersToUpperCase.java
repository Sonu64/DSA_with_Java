public class firstLettersToUpperCase {
    public static String convertLettersToUpper(String sentence, int n) {
        StringBuilder convertedString = new StringBuilder("");
        convertedString.append(Character.toUpperCase(sentence.charAt(0)));
        //boolean lastLetterCapitalized = true;
        for (int i = 1; i < n; i++) {
            if (sentence.charAt(i) == ' ' && i < n-1) {
                convertedString.append(" ");
                convertedString.append(Character.toUpperCase(sentence.charAt(i+1)));
                i++;
            }
            else {
                convertedString.append(sentence.charAt(i));                    
            }
        }
        String finalString = convertedString.toString();
        return finalString;
    }

    
    public static void main(String[] args) {
        String sentence = "hello, world. java is good! makes me elated.";
        System.out.println(convertLettersToUpper(sentence, sentence.length()));
    }
}
