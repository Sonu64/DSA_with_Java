import java.util.*;
public class Print_ArrayList_in_Reverse_and_Find_max {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(879);
        nums.add(4);
        nums.add(5);

        // Printing in Reverse
        System.out.print("ArrayList in Reverse -> ");
        for(int i = nums.size()-1; i>=0; i--) {
            System.out.print(nums.get(i) + ", ");
        }

        System.out.println("\n");
        // Finding Maxium Number in ArrayList
        int max = Integer.MIN_VALUE;
        for (Integer number : nums) {
            // if (number > max) 
            //     max = number;
            max = Math.max(max, number);
        }
        System.out.println("Maximum element in ArrayList = " + max);
    }
}
