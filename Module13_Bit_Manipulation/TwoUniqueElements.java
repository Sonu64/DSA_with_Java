import java.awt.*;

public class TwoUniqueElements {
    public static int get_LS_setBitPosition(int num) {
        int pos = 0, i = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                pos = i;
                break;
            }
            i++;
            num = num >> 1;
        }
        return pos;
    }

    public static int[] findUniqueElements(int nums[]) {
        int xor_result = 0, least_significant_setBit_Position = 0, setIndex = 0;
        int setArray[] = new int[nums.length];
        int uniqueElements[] = new int[2];
        for(int i=0; i<nums.length; i++) {
            xor_result = xor_result ^ nums[i];
        }
        int temp = xor_result;
        least_significant_setBit_Position = get_LS_setBitPosition(xor_result);
        for(int i=0; i<nums.length; i++) {
            // Get Bit at least_significant_setBit_position
            int bit = nums[i] & (1 << least_significant_setBit_Position);
            if (bit == 1) {
                setArray[setIndex] = nums[i];
                setIndex++;
            }
        }

        // setArray now contains only those numbers with bit=1 at least_significant_setBit_position
        for(int i=0; i<setArray.length; i++) {
            temp = temp ^ setArray[i];
        }
        int n1 = temp;
        int n2 = xor_result ^ n1;
        // temp has changed to n1, it is no more equal to n1 ^ n2, but xor_result is still n1 ^ n2

        uniqueElements[0] = n1;
        uniqueElements[1] = n2;

        return uniqueElements;
    }

    public static void main(String[] args) {

        int nums[] = {5, 4, 1, 4, 3, 5, 1, 2, 2, 3, 9, 9, 10, 67};
        int uniques[] = findUniqueElements(nums);

        System.out.println("First unique number, n1 = " + uniques[0]);
        System.out.println("Second unique number, n2 = " + uniques[1]);
    }
}
