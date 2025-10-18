public class largestInArray {

    public static int findLargestInArray(int nums[], int SIZE) {
        int largest = Integer.MIN_VALUE; // Negative Infinity
        for(int i=0; i<SIZE; i++) {
            if (nums[i] > largest)
                largest = nums[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = {45, 90, 123, 56, 786, 453, 899, 12, 10, 654, 346, 923};
        int largest = findLargestInArray(nums, nums.length);
        System.out.println("Largest number in the array is " + largest + ". ");
    }
}
