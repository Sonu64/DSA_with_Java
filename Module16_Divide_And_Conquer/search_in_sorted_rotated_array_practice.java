import java.util.Scanner;




public class search_in_sorted_rotated_array_practice {
    
    public static int search(int[] arr, int target, int start, int end) {
    
    // We can use >= if we calculate mid before this and check if arr[mid]is equal to target or not. This Line will not run for start and end same, when single element is left and the below logic will return mid.
    if (start > end) 
        return -1;
    
    int mid = start + ((end-start)/2);
    if (arr[mid] == target)
        return mid;

    // Mid Lies on L1
    if (arr[mid] >= arr[start]) {
        // to the Left of mid
        if (arr[start] <= target && target <= arr[mid]) {
           return search(arr, target, start, mid-1);
        }
        // to the Right of mid
        else {
            return search(arr, target, mid+1, end);
        }

    }

    // Mid Lies on L2
    else {
        // to the Right of mid
        if (arr[mid] <= target && target <= arr[end]) {
           return search(arr, target, mid+1, end);
        }
        // to the Left of mid
        else {
           return search(arr, target, start, mid-1);
        }
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        System.out.print("Enter Element to Search: ");
        int target = in.nextInt();

        System.out.printf("%d is found at index %d.", target, search(arr, target, 0, arr.length-1));
    }    
}
