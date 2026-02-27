import java.util.*;
public class SortingArrayLists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(15);
        nums.add(19);
        System.out.print("Original ArrayList - ");
        System.out.println(nums);
        Collections.sort(nums);
        System.out.print("Ascending Sort - ");
        System.out.println(nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.print("Descending Sort - ");
        System.out.println(nums);
    }
}
