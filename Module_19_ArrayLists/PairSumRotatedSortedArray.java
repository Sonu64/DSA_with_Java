import java.util.ArrayList;
import java.util.Arrays;



public class PairSumRotatedSortedArray {

    private static int findBreakingPointIndex(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1)) 
                return i;
        }
        return -1;
    }

    private static ArrayList findIndexSum(ArrayList<Integer> arr, int leftPointer, int rightPointer, int targetSum) {
        int n = arr.size();
        // Use != because pointers are moving in a circle; they might not "cross" linearly
        /* 
            To implement modulo arithmetic for a circular array, we treat the array as a ring. The key mathematical insight is that the "next" element is always (i+1)%n and the "previous" element is (i + n - 1)%n
        */ 
        while (leftPointer != rightPointer) {
            int sum = arr.get(leftPointer) + arr.get(rightPointer);
            if (sum == targetSum) {
                return new ArrayList<>(Arrays.asList(leftPointer, rightPointer));
            }
            else if (sum < targetSum) {
                // Circular increment
                leftPointer = (leftPointer + 1) % n;
            } else {
                // Circular decrement
                rightPointer = (rightPointer + n - 1) % n;
            }
        }
        return new ArrayList<>(Arrays.asList(-1, -1));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        int breakingPointIndex = findBreakingPointIndex(arr);
        int rightPointer = breakingPointIndex; // Pointing to Largest Element
        int leftPointer = breakingPointIndex+1; // Pointing to Smallest Element 
        int targetSum = 16;
        System.out.println(findIndexSum(arr, leftPointer, rightPointer, targetSum));
    }
}
