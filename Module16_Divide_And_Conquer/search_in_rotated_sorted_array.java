import java.util.Scanner;

public class search_in_rotated_sorted_array {

    public static int search(int[] arr, int target, int start, int end) {

        // Finding mid position
        int mid = start + ((end-start)/2);
        // Found target at mid
        if (arr[mid] == target)
            return mid;

        /** When last element standing but the condition above fails. Use start > end if you wanna write
         this logic check before mid calculation and checking wheather arr[mid] == target.
         For Last Element standing, start == mid is TRUE, but before even this logic runs, the previous
         logic returned mid **/
        if (start >= end)
            return -1;



        // target lies on L1
        if (arr[start] <= arr[mid]) {
            // target lies Left of Mid
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid-1);
            }
            // target lies Right of Mid
            else {
                return search(arr, target, mid + 1, end);
            }
        }

        // Mid on L2
        else {
            // Right of mid
            if (arr[mid]<=target && target<=arr[end])
                return search(arr, target, mid+1, end);
                // Left of mid
            else
                return search(arr, target, start, mid-1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.print("Enter Element to Search: ");
        int target = in.nextInt();

        System.out.printf("%d is found at index %d.", target, search(arr, target, 0, arr.length-1));
    }
}
