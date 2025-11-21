public class insertionSort {

    public static void performInsertionSort(int arr[], int n) {
        for(int i=1; i<n; i++) {
            int curr = arr[i];
            int prevIndex = i-1;
            while (prevIndex >= 0 && arr[prevIndex] > curr) {
                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex+1] = curr;
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
        performInsertionSort(arr, arr.length);
        System.out.print("Sorted Array: ");
        displayArray(arr, arr.length);
    }
}
