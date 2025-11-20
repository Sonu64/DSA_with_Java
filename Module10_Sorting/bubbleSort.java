public class bubbleSort {

    public static void performBubbleSort(int arr[], int n) {
        for(int i=0; i<n-1; i++) {
            int swaps = 0;
            for(int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0)
                break;

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
        performBubbleSort(arr, arr.length);
        System.out.print("Sorted Array: ");
        displayArray(arr, arr.length);
    }
}
