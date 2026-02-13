import java.util.*;

public class permutations_LEETCODE {
    // Global storage
    static List<List<Integer>> results = new ArrayList<>();
    static Set<Integer> used = new HashSet<>();

    public static void solve(int[] nums, List<Integer> temp) {
        // ...Base Case

        
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp)); 
            return;
        }

        // ...Recursive and Backtracking steps
        for (int i = 0; i < nums.length; i++) {
            if (!used.contains(nums[i])) {
                //..Do
                used.add(nums[i]);
                temp.add(nums[i]);
                //..Explore
                solve(nums, temp);
                //..Undo
                temp.remove(temp.size() - 1);
                used.remove(nums[i]);
                //..Loop continues to explore next candidate - As we are not using a backtracking index, continuation of the Loop ensures that we are exploring with the UNDO option done☑️ The for loop naturally moves to the next candidate after the previous recursive branch has fully collapsed and been cleaned up.
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        
        // 1. Reset/Prepare the global state
        results.clear();
        used.clear();
        
        // 2. Start the process directly
        List<Integer> temp = new ArrayList<>();
        solve(nums, temp);

        // 3. Print the outcome
        System.out.println("Permutations:");
        for (List<Integer> p : results) {
            System.out.println(p);
        }
    }
}