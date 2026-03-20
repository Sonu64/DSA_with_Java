// Note : -
// - Modify the function or parameters if needed.
// - Signatures function may vary, adjust parameters if required.

class Solution {
    public int removeDuplicatesFromSortedArray(int[] nums) {
        int slowPointer = 0;
        int fastPointer;
        for(fastPointer=1; fastPointer<nums.length; fastPointer++) {
            if(nums[fastPointer] != nums[slowPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }
        }
        return slowPointer+1; // count
    }
}