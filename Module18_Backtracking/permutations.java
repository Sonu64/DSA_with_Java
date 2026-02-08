import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class permutations
{
  /**
   *
   * @param inputString --> Contains the actual String --> Characters will be
   *     taken OUT from here
   * @param outputString --> Contains the new string generated from the
   *   inputString --> Characters will be put IN here.
   */
  static void
  permutations (String inputString, String outputString,
                ArrayList<String> results)
  {
    //...Base case
    if (inputString.length () == 0)
      {
        results.add (outputString);
        return;
      }
    //..Recursive Steps
    // Loop through every character
    for (int i = 0; i < inputString.length (); i++)
      {
        // Store current Character to be added to outputString Later
        char currChar = inputString.charAt (i);
        // As Strings in Java are True Pass by value, making a new string which
        // does not contain the current char -> That char is
        //.. already chosen
        // newInputString is needed because Strings are TRUE pass by value
        String newInputString
            = inputString.substring (0, i)
              + inputString.substring (i + 1, inputString.length ());
        // Once a character is chosen -> Go DEEP in the path --> Append current
        // character to outputString in the process
        permutations (newInputString, outputString + currChar, results);
      }
  }

  public static void
  main (String[] args)
  {
    Scanner in = new Scanner (System.in);
    System.out.print ("Enter a String: ");
    String inputString = in.nextLine ();
    String outputString = "";
    ArrayList<String> results = new ArrayList<> ();
    permutations (inputString, outputString, results);

    // Removing Duplicates by converting to Sets, order gone !
    // Removing duplicates using Sets.
    // Convert to Set (removes duplicates and loses order,
    // ... but in the question order does not matter)
    Set<String> resultSet = new HashSet<> (results);
    // Convert back to ArrayList<String>
    // Convert Set back to List
    ArrayList<String> listFromSet = new ArrayList<> (resultSet);

    if (inputString.length () != 0)
      {
        System.out.println ("--- All Permutations of " + inputString
                            + " are as follows ---");
        for (int i = 0; i < listFromSet.size (); i++)
          {
            if (i == listFromSet.size () - 1)
              System.out.print (listFromSet.get (i));
            else
              System.out.print (listFromSet.get (i) + ", ");
          }
      }
    else
      System.out.println ("Your Empty String has no permutations !");
  }
}


/*The "Hidden" Backtrack: You don't need a manual .delete() step here! Since you never modified the original inputString or outputString in the current frame, the state is naturally "restored" when the recursive call returns. If we used StringBuilder instead of Strings for outputString, we need .delete() manually. 
➡️ first append currChar to outputString
➡️ then recursively call f(newInputString, outputString, ...) 
➡️ then remove that last inserted char via outputString.delete(size-1)
🙂 inputString is still kept String, keeping it String (Immutable) makes sense as the data to be shared across calls (persistent data) needs to be StringBuilder(Mutable)--> manual deletion needed to go back one level.

*/
