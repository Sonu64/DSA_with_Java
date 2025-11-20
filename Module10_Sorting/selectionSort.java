public class selectionSort {

    public static void performSelectionSort(int arr[], int n) {
        int i = 0, j = 0;
        for(i = 0; i < n-1; i++) {
            int smallestIndex = i;
            for(j = i+1; j < n; j++) {
                if (arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
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
        performSelectionSort(arr, arr.length);
        System.out.print("Sorted Array: ");
        displayArray(arr, arr.length);
    }
}
