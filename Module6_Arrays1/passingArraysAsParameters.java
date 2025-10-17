public class passingArraysAsParameters {

    public static void updateArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * 10;
        }
    }

    public static void displayArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int nums[] = {45, 56, 67, 78, 89, 90};

        // Old Numbers
        System.out.println("Old Numbers - ");
        displayArray(nums);

        // Updating Array, Passed by Reference
        updateArray(nums);

        // New Numbers
        System.out.println("\nUpdated Numbers - ");
        displayArray(nums);

    }
}
