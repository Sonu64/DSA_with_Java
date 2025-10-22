public class maxSubArraySumKadanesAlgorithm {
    public static int applyKadanesAlgorithm(int nums[], int SIZE) {
        int sum = 0, max = Integer.MIN_VALUE, startingPosition = 0, endingPosition = 0, i;
        for(i = 0; i < SIZE; i++) {
            //sum = 0
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
                endingPosition = i;
            }
            if (sum < 0) {
                sum = 0;
                startingPosition++;
            }
        }
        
        //maxPivot = i;
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

