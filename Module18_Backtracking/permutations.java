public class permutations {
    
    /**
     * 
     * @param inputString --> Contains the actual String --> Characters will be taken OUT from here
     * @param outputString --> Contains the new string generated from the inputString --> Characters will be put IN here.
     * Function simply prints all Permutations, not appending to something like results Array or similar.
     */
    static void permutations(String inputString, String outputString) {

        // Base Case
        if (inputString.length() == 0) {
            System.out.print(outputString + " ");
            return;
        }

        // Loop to iterate through each character
        for(int i=0; i<inputString.length(); i++) {
            char currChar = inputString.charAt(i);
            // Removing the character currChar from the inputString
            String newString = inputString.substring(0, i) + inputString.substring(i+1, inputString.length());
            // Once a character is chosen ---> Go Deep into the branch with modified inputString, which does not include that character
            permutations(newString, outputString+currChar); // Appending occurs here actually !
        }
    }
    
    public static void main(String[] args) {
        String inputString = "abcd";
        String outputString = "";
        permutations(inputString, outputString);
    }
}
