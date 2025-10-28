public class maxSubArraySumKadanesAlgorithm {
    public static int applyKadanesAlgorithm(int nums[], int SIZE) {
        int sum = 0, max = Integer.MIN_VALUE, startingPosition = -1, endingPosition = -1, i, start = 0;
        for(i = 0; i < SIZE; i++) {
            // Whenever sum is 0, that's the starting of a new subarray
            if (sum == 0)
                start = i;

            sum = sum + nums[i];

            // And whenever we get a sum > max, start is the startingPosition
            // and the current index is the endingPosition
            if (sum > max) {
                max = sum;
                startingPosition = start;
                endingPosition = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }


        System.out.println("Subarray with Maximum Sum is - ");
        for(int j = startingPosition; j < endingPosition + 1; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8};
        System.out.println("Maximum Subarray Sum is " + applyKadanesAlgorithm(nums, nums.length) + ". ");
    }
}

