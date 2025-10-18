public class reverseArray {

    public static void reverseArray(int nums[], int SIZE) {
        int first = 0, last = SIZE - 1, temp;
        while (first <= last) {
            temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void displayArray(int nums[], int SIZE) {
        for(int i=0; i<SIZE; i++)
            System.out.print(nums[i] + "\t");
    }

    public static void main(String[] args) {
        int nums[] = {23, 21, 56, 67, 9, 10};
        System.out.println("Original Array - ");
        displayArray(nums, nums.length);
        System.out.println();
        reverseArray(nums, nums.length);
        System.out.println("Reversed Array - ");
        displayArray(nums, nums.length);
    }
}
