public class subArrays {

    public static void printAllSubArrays(int nums[], int SIZE) {
        // As we need single last element also, we take i < SIZE and not i < SIZE-1
        for(int i = 0; i < SIZE; i++) {
            // As we need single pivot element also, we start j from i and not i+1.
            for(int j = i; j < SIZE; j++) {
                for(int k = i; k < j+1; k++) {
                    System.out.print(nums[k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        System.out.println("All Subarrays of the Array are - ");
        printAllSubArrays(nums, nums.length);
    }
}

