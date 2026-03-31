import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        final int TARGET = 0;

        List<List<Integer>> answer = new ArrayList<>();

        int anchor = 0;
        for(anchor = 0; anchor <= nums.length-3; anchor++) {
            int left = anchor + 1, right = nums.length-1;
            // Skip Anchor Duplicates - If 2 back-to-back anchors come out as SAME !
            if(anchor > 0 && nums[anchor] == nums[anchor-1])
                continue;
            while (left < right) {
                int sum = nums[anchor] + nums[left] + nums[right];
                if (sum < TARGET) 
                    left++;
                else if (sum > TARGET) 
                    right--;
                else {
                    answer.add(Arrays.asList(nums[anchor], nums[left], nums[right]));
                    
                    // Skip Internal Duplicates, like - 1, 1, 1...but the 1st 1 was left OR right..we should skip the next all positions
                    while(left < right && nums[left] == nums[left+1]) 
                        left++;
                    while(right > left && nums[right] == nums[right-1])
                        right--;
                    // Only increment the pointers here, once we are sure that incrementing them will result in Distinct Numbers
                    left++;
                    right--;
                }
            }
        }
        return answer;
    }
}