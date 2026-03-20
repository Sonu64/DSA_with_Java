// Since the problem doesn't specify that the input array is sorted, we can sort a copy of the array and use two pointers to find the two numbers that add up to the target. After finding those numbers, we can then find their original indices in the unsorted array. The time complexity of this approach is O(n log n) due to the sorting step, and the space complexity is O(n) because we are creating a copy of the original array. To achieve O(n) time complexity, we can use a HashMap to store the numbers and their indices as we iterate through the array. This way, we can check if the complement (target - current number) exists in the HashMap in constant time. The space complexity of this approach is also O(n) due to the HashMap storing all the elements. But without using HashMap, the two-pointer approach is a valid solution as well, and NlogN is way less than N^2, which is the brute-force approach.

import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(nums);

        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int[] answer = {-1, -1};

        while(true) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if(sum > target)
                rightPointer--;
            else if (sum < target)
                leftPointer++;
            else  {
                break;
            }
        }
        
        // Since we need the original Indices...
        for (int i = 0; i < copy.length; i++) {
            // Find first index
            if (copy[i] == nums[leftPointer] && answer[0] == -1) {
                answer[0] = i;
            } 
            // Find second index (ensuring it's not the same slot)
            else if (copy[i] == nums[rightPointer]) {
                answer[1] = i;
            }
        }
        return answer;
    }
}