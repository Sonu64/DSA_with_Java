public class singleNumber2 {
    public static int findUnique(int[] nums) {
        int result = 0;
        // Loop through 32 positions, and for each position Loop over all numbers
        for(int bitPosition = 0; bitPosition < 32; bitPosition++) {
            int bitCount = 0;
            for (int number : nums) {
                // Get i-th bit of number where i = bitPosition
                int bit = number & (1 << bitPosition);
                if (bit != 0) bitCount++;
            }
            bitCount = bitCount % 3; // Will either be 0 or 1
            System.out.println(bitCount);
            // Set bit at bitPosition to 1 in result
            result = result | (bitCount << bitPosition);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,2,3,4,3,3,4,4, 1, 1, 5};
        System.out.println("Unique Element in the array is " + findUnique(arr) + ".");
    }
}
