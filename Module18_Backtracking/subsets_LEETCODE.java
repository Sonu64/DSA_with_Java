import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subsets_LEETCODE {
    // Global and Static: Accessible everywhere in this class
    static List<List<Integer>> results = new ArrayList<>();

    public static void solve(int[] nums, int i, List<Integer> temp) {
        // Base Case
        if (i == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        }

        // Do...
        temp.add(nums[i]);
        // Explore...
        solve(nums, i + 1, temp);
        // Undo... 
        temp.remove(temp.size() - 1);
        // Explore...
        solve(nums, i + 1, temp);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        // Start the recursion
        solve(nums, 0, new ArrayList<>());

        // Print the global results list
        System.out.println("Generated Subsets: " + results);
        
        in.close();
    }
}