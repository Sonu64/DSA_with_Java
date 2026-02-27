import java.util.*;

public class Swap {


    private static void swapNumbers(ArrayList<Integer> nums, int a, int b) {
        int temp = nums.get(b);
        nums.set(b, nums.get(a));
        nums.set(a, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(90);
        nums.add(23);
        nums.add(10);
        nums.add(34);
        nums.add(11);
        System.out.println("Nums = " + nums);
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Index: ");
        a = in.nextInt();        
        System.out.print("Enter 2nd Index: ");
        b = in.nextInt();
        swapNumbers(nums, a, b);
        System.out.println("Nums after Swapping = " + nums);
    }
}
