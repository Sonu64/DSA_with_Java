import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class gfg_permutations {
    class Solution {
    
    public void findPermutations
    (String inputString, String outputString, ArrayList<String> results) {
        //...Base case
        if(inputString.length() == 0) {
            results.add(outputString);
            return;
        }
        //..Recursive Steps
        // Loop through every character
        for(int i=0; i<inputString.length(); i++) {
            // Store current Character to be added to outputString Later
            char currChar = inputString.charAt(i);
            // As Strings in Java are True Pass by value, making a new string which does not contain the current char -> That char is
            //.. already chosen
            String newInputString = inputString.substring(0, i) + inputString.substring(i+1, inputString.length());
            // Once a character is chosen -> Go DEEP in the path --> Append current character to outputString in the process
            findPermutations(newInputString, outputString+currChar, results);
        }
    }
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> results = new ArrayList<>();
        String outputString = "";
        findPermutations(s, outputString, results);
        // Removing duplicates using Sets.
        // Convert to Set (removes duplicates and loses order, 
        // ... but in the question order does not matter)
        Set<String> resultSet = new HashSet<>(results);
        // Convert back to ArrayList<String>
        // Convert Set back to List
        ArrayList<String> listFromSet = new ArrayList<>(resultSet);
        return listFromSet;
    }
}
}
