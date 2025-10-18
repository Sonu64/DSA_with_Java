import java.util.Scanner;

public class binarySearch {

    public static int performBinarySearch(int nums[], int key, int SIZE) {
        int start = 0, end = SIZE-1, mid;
        while(start <= end) {
            mid = (int) Math.floor((start + end)/2.0);
            if (nums[mid] == key)
                return mid;
            else if (nums[mid] > key)
                end = mid - 1;
            else if (nums[mid] < key)
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key, foundIndex;
        System.out.print("Enter number to search in the Array: ");
        key = in.nextInt();
        foundIndex = performBinarySearch(nums, key, nums.length);
        if (foundIndex != -1)
            System.out.println(key + " is found at index " + foundIndex + ". ");
        else
            System.out.println(key + " is not found in the Array.");
    }
}
