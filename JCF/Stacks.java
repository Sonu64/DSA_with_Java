import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        // List<String> animals = new Stack<>(); // Error because List does not have push() or pop() methods !
        // Those are exclusive for Stack !
        Stack<String> animals = new Stack<>();
        animals.push("Beral");
        animals.push("Baagh");
        animals.push("Haati"); 
        System.out.println(animals); 
        System.out.println(animals.peek() + " is Top !"); // Topmost Element of Stack -> Haati
        System.out.println(animals.pop() + " is Popped !"); // Topmost element popped out ! Haati is no longer existing !  
        System.out.println(animals.peek() + " is now Top :)");
        System.out.println(animals);  
        
        // Iterating
        for (String animal : animals) {
            System.out.println(animal);
        } // -> Printed from Bottom to Top !! Logical as index 0 was 1st inserted, and it sits at the bottom of the stack :)

        //size
        System.out.println(animals.size());

        //clear
        animals.clear();
        System.out.println(animals);
    }
}
