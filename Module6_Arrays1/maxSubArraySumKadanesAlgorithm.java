public class maxSubArraySumKadanesAlgorithm {

    public static int applyKadanesAlgorithm(int nums[], int SIZE) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < SIZE; i++) {
            //sum = 0
            sum = sum + nums[i];

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, -1, -2, 20};
        System.out.println("Maximum Subarray Sum is " + applyKadanesAlgorithm(nums, nums.length) + ". ");
    }
}

