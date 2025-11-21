import java.util.Arrays;
import java.util.Collections;

public class inBuiltSort {
    public static void displayArray(int arr[], int n) {
        for(int i=0; i<n; i++) {
            if (i == n-1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + ", ");
        }
    }

    public static void main (String[] args) {
        int arr1[] = {5, 4, 1, 2, 3};
        Integer arr2[] = {6, 8, 1, 9, 7};
        System.out.print("Original Arrays: \n");
        displayArray(arr1, arr1.length);
        System.out.println();
        for(int i=0; i<arr2.length; i++) {
            if (i == arr2.length-1)
                System.out.print(arr2[i] + " ");
            else
                System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        System.out.print("Sorted 1st Array in Ascending Order: ");
        Arrays.sort(arr1);
        displayArray(arr1, arr1.length);
        System.out.print("\nSorted 2nd Array for the first 4 elements in Descending Order: ");
        Arrays.sort(arr2, 0, 4, Collections.reverseOrder());
        for(int i=0; i<arr2.length; i++) {
            if (i == arr2.length-1)
                System.out.print(arr2[i] + " ");
            else
                System.out.print(arr2[i] + ", ");
        }
        System.out.println();

    }
}
