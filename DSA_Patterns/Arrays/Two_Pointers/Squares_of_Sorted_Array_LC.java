// Note : -
// - Modify the function or parameters if needed.
// - Signatures function may vary, adjust parameters if required.

class Solution {
    public int[] squaresOfASortedArray(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int[] answer = new int[nums.length]; // [0,0,0,...0]
        int curr = nums.length-1;
        while(leftPointer <= rightPointer) {
            if(Math.abs(nums[leftPointer]) > Math.abs(nums[rightPointer])) {
                int squared = nums[leftPointer] * nums[leftPointer];
                answer[curr] = squared;
                curr--;
                leftPointer++;
            } 
            else {
                int squared  = nums[rightPointer] * nums[rightPointer];
                answer[curr] = squared;
                curr--;
                rightPointer--;
            }
        }
        return answer;
    }
}