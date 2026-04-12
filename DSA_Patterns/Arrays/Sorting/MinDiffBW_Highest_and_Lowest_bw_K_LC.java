import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int N = nums.length;
        int minDiff = Integer.MAX_VALUE;

        // As you move from i to i+1, the whole window "shifts" right by one. The distance between the new edges is all that matters.
        for(int i=0; i<=N-k; i++) {
            int currDiff = nums[i+k-1]-nums[i];
            minDiff = Math.min(currDiff, minDiff);
        }

        return minDiff;

    }
}