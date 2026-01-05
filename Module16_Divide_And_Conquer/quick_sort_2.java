public class quick_sort_2  {

    public static void quickSort2(int[] arr, int lb, int ub) {
        if (lb < ub) {
            // No need of <=, as in that case we will swap arr[end] with arr[end],
            // as lb = ub = start = end. But using <= will not cause any error !
            int pivotPosition = partition(arr, lb, ub);
            quickSort2(arr, lb, pivotPosition - 1);
            quickSort2(arr, pivotPosition + 1, ub);
        }
        return;
    }

    public static int partition(int[] arr, int lb, int ub) {
        int start = lb;
        int end = ub;
        int pivotElement = arr[lb];

        while (start < end) {
            // Values of start and end change within the loop, based on some condition
            // Don't use <=, because we only swap if start is before end, We don't swap if start = end
            // or start crosses end.
            while (arr[start] <= pivotElement)
                start++;
            while (arr[end] > pivotElement)
                end--;
            if (start < end) { // Don't swap if start >= end, start crosses end or is equal to end !
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {20, 25, 22, 78, 65, 64, 52, 90};
        // Displaying original unsorted array
        System.out.print("Original Array:\t");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

        // Performing merge sort algorithm on the array, passed by referenc
        quickSort2(arr, 0, arr.length - 1);

        // Displaying Sorted array
        System.out.print("\nSorted Array:\t");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1)
                System.out.print(arr[i] + "");
            else
                System.out.print(arr[i] + " < ");
        }
    }
}
