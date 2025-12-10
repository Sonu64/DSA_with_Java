import java.util.Arrays;

public class xorOfDoubleNumbers {
    public static int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        int duplicates[] = new int[nums.length];
        int duplicateIndex = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if (i == nums.length-1) break;
            if (nums[i] == nums[i+1]) {
                duplicates[duplicateIndex] = nums[i];
                duplicateIndex++;
            }
        }

        if (duplicates.length == 0) {
            result = 0;
        }

        else {
            for(int i=0; i<duplicates.length; i++) {
                result ^= duplicates[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3};
        System.out.println(duplicateNumbersXOR(arr));
    }
}
