import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        
        int extremePositives = nums[N-1] * nums[N-2] * nums[N-3];
        int twoNegativesAndLargestPositive = nums[0] * nums[1] * nums[N-1];
        int maxProd = Math.max(extremePositives, twoNegativesAndLargestPositive);

        return maxProd;
    }
}