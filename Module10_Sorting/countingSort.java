import java.util.Arrays;
import java.util.Collections;

public class countingSort {

    public static void performCountingSort(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // Getting max value and creating count array
        for(int i = 0; i < n; i++)
            max = Math.max(max, arr[i]);
        for(int i = 0; i < n; i++)
            min = Math.min(min, arr[i]);
        int count[] = new int[max + 1];
        // Filling array with zeroes
        for (int i = 0; i < count.length; i++)
            count[i] = 0;
        // Putting frequencies into count
        for (int i = 0; i < n; i++)
            count[arr[i]]++;
        // Sorting
        int j = 0; // index for inserting into arr
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void displayArray(int arr[], int n) {
        for(int i=0; i<n; i++) {
            if (i == n-1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + ", ");
        }
    }

    public static void main (String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        System.out.print("Original Array: ");
        displayArray(arr, arr.length);
        System.out.println();

        performCountingSort(arr, arr.length);
        System.out.print("Counting Sorted Array: ");
        displayArray(arr, arr.length);
    }
}
