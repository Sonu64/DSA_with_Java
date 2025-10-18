import java.util.Scanner;

public class linearSearch {

    public static int performLinearSearch(int nums[], int key, int SIZE) {
        for(int i=0; i<SIZE; i++) {
            if (nums[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = {56, 78, 12, 45, 66, 99, 18};
        int key, foundIndex;
        System.out.print("Enter Key to search in the array: ");
        key = in.nextInt();
        foundIndex = performLinearSearch(nums, key, nums.length);
        if (foundIndex != -1)
            System.out.println(key + " is found at index " + foundIndex + ". ");
        else
            System.out.println(key + " is not found in the Array.");

    }
}
