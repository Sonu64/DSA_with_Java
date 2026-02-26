import java.util.*;
public class basics {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1000);
        nums2.add(2000);

        // Adding elements
        nums.add(10);
        nums.add(20);
        System.out.println(nums);
        // Adding elements at a position
        nums.add(1, 99); 
        System.out.println(nums);


        // Appending 2 array lists
        nums.addAll(nums2);
        System.out.println(nums);


        // Removing elements
        // Remove 1st occurence With value
        nums.add(1000);
        nums.remove(Integer.valueOf(1000));
        System.out.println(nums);
        // Remove at index
        nums.remove(1);
        System.out.println(nums);

        // Updating values at particular positions
        nums.set(1, 9999);
        System.out.println(nums + "\n");


        // Checking wheather an element exists or not
        if (nums.contains(999))
            System.out.println("999 is in the ArrayList !");
        else
            System.out.println("999 is not in the ArrayList !");

        System.out.println();
        // Iterating through ArrayLists !
        // Using for-Each Loop
        for (Integer number : nums) {
            System.out.println("Number is " + number);
        }
        System.out.println();
        // Using Iterator Interface
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+"   ");
        }
        System.out.println("\n");
        // Using simple index based for loop
        for(int i = 0; i < nums.size(); i++) 
            System.out.println("Number @ position " + i + " is " + nums.get(i)); 

    }    
}
