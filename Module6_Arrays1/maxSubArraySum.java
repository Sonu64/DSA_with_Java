/* Finding the Maximum Sum obtained by summing up all possible Subarrays of an array
*  using Brute-Force Approach */

import java.util.Scanner;
public class maxSubArraySum {
    public static int findMaxSubArraySum(int nums[], int SIZE) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = i; j < SIZE; j++) {
                sum = 0;
                for (int k = i; k < j + 1; k++) {
                    sum = sum + nums[k];

                    if (sum > max) {
                        max = sum;
                        //System.out.print("\nSum = " + sum);
                    }
                }
                // Printing all Sums
                System.out.println(sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6};
        System.out.println("Maximum Subarray Sum is " + findMaxSubArraySum(nums, nums.length) + ". ");
    }
}

