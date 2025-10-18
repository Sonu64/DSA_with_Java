public class pairs {

    public static void printPairs(int nums[], int SIZE) {
        for(int i = 0; i < SIZE - 1; i++) {
            for(int j = i+1; j < SIZE; j++) {
                System.out.printf("(%d, %d)\t", nums[i], nums[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        System.out.println("All Unique pairs in the Array are - ");
        
        printPairs(nums, nums.length);
    }
}
