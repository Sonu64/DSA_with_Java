/* Code to find the Maximum */

public class maxSubArraySumPrefixSumApproach {
    public static int findMaxSubArraySum(int nums[], int SIZE) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < SIZE; i++) { // Pivot chooser Loop
            sum = 0;
            for (int j = i; j < SIZE; j++) { // 'Upto' chooser Loop
                sum = sum + nums[j];
                if (sum > max)
                    max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8};
        System.out.println("Maximum Subarray Sum is " + findMaxSubArraySum(nums, nums.length) + ". ");
    }
}
