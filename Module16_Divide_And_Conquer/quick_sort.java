public class quick_sort {

    public static void quickSort(int[] arr, int start, int end) {
        // Base Case
        if (start >= end)
            return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1); // Left
        quickSort(arr, pivotIndex + 1, end); // Right
    }

    public static int partition(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        int i = start - 1; // To make place for elements < pivotElement
        int j = 0; // Iterator of main Array
        for (j = 0; j < arr.length; j++) {
            // For elements Lesser than pivotElement -> Swap, as they should be left of pivotIndex
            // in the new Empty Array --> Actually this is not a new array, we swap arr[j] with arr[i]
            // as arr[j] is in wrong position but arr[i] was already in correct position.
            // We swap only when we see that current element arr[j] with arr[i], when arr[j] < pivotElement
            // arr[i] is already in correct position as it will make space for pivot later, arr[j] is
            // misplaced.
            if (arr[j] < pivotElement) {
                i = i + 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            // Else the element is already in correct order,
            // i.e -> More than pivotElement means they will stay to Right as they are.
        }
        // Finally Put the pivot in correct place by swapping it with arr[i++]
        i++;
        int temp = arr[i];
        arr[i] = pivotElement; // Now pivot Element got new position = i
        arr[end] = temp; // Put temp in previous pivot Position

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {34, 21, 56, 40, 90, 89, 91};

        // Displaying original unsorted array
        System.out.print("Original Array:\t");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

        // Performing merge sort algorithm on the array, passed by referenc
        quickSort(arr, 0, arr.length - 1);

        // Displaying Sorted array
        System.out.print("\nSorted Array:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}