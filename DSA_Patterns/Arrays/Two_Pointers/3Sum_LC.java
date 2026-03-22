import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        final int TARGET = 0;

        List<List<Integer>> answer = new ArrayList<>();

        for (int anchor = 0; anchor <= nums.length - 3; anchor++) { // Corrected: Needs room for 3 elements

            int leftPointer = anchor + 1;
            int rightPointer = nums.length - 1;
            
            while (leftPointer < rightPointer) { // Corrected: < to ensure 3 distinct indices
                int sum = nums[anchor] + nums[leftPointer] + nums[rightPointer];
                
                if (sum < TARGET) 
                    leftPointer++;
                else if (sum > TARGET) 
                    rightPointer--;
                else {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[anchor]);
                    triplet.add(nums[leftPointer]);
                    triplet.add(nums[rightPointer]);
                    answer.add(triplet);

                    leftPointer++;
                    rightPointer--;
                }
            }
        }
        
        Set<List<Integer>> answerSet = new HashSet<>(answer);
        return new ArrayList<>(answerSet); // Corrected: ArrayList instead of List
    }
}