class Solution {
    public int removeDuplicates(int[] nums) {

        // Edge case: If array is empty, return 0
        if (nums.length == 0) return 0;

        // slowPointer tracks the last "accepted" position in the modified array.
        // We start at 1 because the first two elements (indices 0 and 1) 
        // are always valid by default in a 'max-two' scenario.
        int slowPointer = 1; 
        int fastPointer; 

        // fastPointer explores the original array starting from the third element.
        for(fastPointer = 2; fastPointer < nums.length; fastPointer++) {
            
            // CRITICAL CHECK: Compare the scout (fast) with the element 
            // placed TWO spots behind the current boundary.
            // If they are different, it means we haven't hit a "triplet" yet.
            if(nums[fastPointer] != nums[slowPointer - 1]) {
                
                // Move the boundary forward to the next available slot.
                slowPointer++;
                
                // Overwrite the slot with the newly discovered valid element.
                nums[slowPointer] = nums[fastPointer];
            }
        }

        // Since slowPointer is an index, the total count of valid elements is index + 1.
        return slowPointer + 1; 
    }
}