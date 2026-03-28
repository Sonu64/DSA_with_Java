class Solution {
    // public void sortColors(int[] nums) {
        // Current Solution is Counting Sort, O(n), O(1)
        // Better approach is Dutch national flag algorithm.
    //     int zCount = 0;
    //     int oCount = 0;
    //     int tCount = 0;
    //     for(int i=0; i<nums.length; i++) {
    //         if (nums[i]==0)
    //             zCount++;
    //         if (nums[i]==1)
    //             oCount++;
    //         if (nums[i]==2)
    //             tCount++;
    //     }
        // Loop for 0s: 0 to zCount
    //     for(int i = 0; i < zCount; i++) {
    //         nums[i] = 0;
    //     }

        // Loop for 1s: zCount to (zCount + oCount)
    //     for(int i = zCount; i < zCount + oCount; i++) {
    //         nums[i] = 1;
    //     }

        // Loop for 2s: (zCount + oCount) to nums.length
    //     for(int i = zCount + oCount; i < nums.length; i++) {
    //         nums[i] = 2;
    //     }
    // }

    /** Dutch National Flag Algorithm */
    public void sortColors(int[] nums) {
        int N = nums.length;
        int lowPointer = 0;
        int midPointer = 0;
        int highPointer = N-1;
        while(midPointer <= highPointer) {
            if (nums[midPointer] == 0) {
                swap(nums, midPointer, lowPointer);
                // midPointer can be safely increased, as we know that incoming value is 1, and we know it. // midPointer refers to 1st unknown Value, since incoming value is known, mid can be safely increased.
                // 🛡️ Why it's still safe to increment midPointer
                // Even though the incoming value is a 1 (not a 0), it is still a known value.
                // We already "scanned" that 1 when midPointer passed over it earlier.
                // Since we know for a fact that index midPointer now contains a 1, we don't need to re-examine it.
                // We can safely do midPointer++
                midPointer++;
                lowPointer++;
            }
            else if (nums[midPointer] == 1) {
                midPointer++;
            }
            else if(nums[midPointer] == 2) {
                swap(nums, midPointer, highPointer);
                // We don't know what's incoming, so we should not increment mid here, else we might skip some values. Mid again must represent the 1st unknown value. Here the incoming is unknown, so mid stays the same place.
                // "I've moved a known 2 to the back, but now I have a new mystery element at my current position that needs a fresh inspection."
                highPointer--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}