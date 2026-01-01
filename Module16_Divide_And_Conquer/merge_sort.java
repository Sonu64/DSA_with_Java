public class merge_sort {

    public static void mergeSort(int[] arr, int start, int end) {
        // Base Case
        if (start >= end) return;

        // Calculate mid
        int mid = start+((end-start)/2);

        // Sort Left Part
        mergeSort(arr, start, mid);
        // Sort Right Part
        mergeSort(arr, mid+1, end);

        // Finally Merge the 2 sorted parts.
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int i = start; // Left iterator
        int j = mid+1; // Right iterator
        int k = 0; // Temp Array iterator

        // Loop to put elements from both arrays into temp, Sorted !
        while (i <= mid && j <= end) {
            // Left element smaller
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            // Right element smaller
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // But when the loop will finish, some elements will be remaining in one of the Parts
        // Elements left in Left array
        while (i <= mid) {
            temp[k] = arr[i];
            i++; k++;
        }
        // Elements left in Right Array
        while (j <= end) {
            temp[k] = arr[j];
            j++; k++;
        }
        // Copy Elements of temp to arr.
        for (int tempIterator = 0, copyingIterator = start; tempIterator<temp.length; tempIterator++, copyingIterator++) {
            arr[copyingIterator] = temp[tempIterator];
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 21, 56, 40, 90, 89, 91};

        // Displaying original unsorted array
        System.out.print("Original Array:\t");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "\t");

        // Performing merge sort algorithm on the array, passed by referenc
        mergeSort(arr, 0, arr.length-1);

        // Displaying Sorted array
        System.out.print("\nSorted Array:\t");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
