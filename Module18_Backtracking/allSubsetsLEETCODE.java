class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        // Start recursion from index 0
        findAllSubsets(nums, ans, currentPath, 0);

        return ans;

    }

    public void findAllSubsets(int[] nums, List<List<Integer>> ans, List<Integer> currentPath, int i) {

        // Base cases
        if (i == nums.length) {
            // CORRECT: Creates a new list with the current values and adds that.
            ans.add(new ArrayList<>(currentPath));
            return;
        }

        // ... Recursive Steps -> Backtracking
        currentPath.add(nums[i]); // 1. Write on the board
        findAllSubsets(nums, ans, currentPath, i + 1); // 2. Explore

        // BACKTRACK: The "Undo"
        currentPath.remove(currentPath.size() - 1); // 3. Erase the last thing you wrote

        // NO Branch: Exclude nums[i]
        findAllSubsets(nums, ans, currentPath, i + 1); // 4. Explore with a clean board

    }
}