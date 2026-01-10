public class inversion_count {

    public static int mergeSort(int[] arr, int start, int end, int count) {
        // Base Case
        if (start >= end) return count;

        // Calculate mid
        int mid = start+((end-start)/2);

        // Sort Left Part
        int a = mergeSort(arr, start, mid, 0);
        // Sort Right Part
        int b = mergeSort(arr, mid+1, end, 0);

        // Finally Merge the 2 sorted parts.
        int c = a+b+merge(arr, start, mid, end, 0);
        // System.out.print("Inversions Count = " + count);
        return c;
    }

    public static int merge(int[] arr, int start, int mid, int end, int count) {
        int[] temp = new int[end-start+1];
        int i = start; // Left iterator
        int j = mid+1; // Right iterator
        int k = 0; // Temp Array iterator

        // Loop to put elements from both arrays into temp, Sorted !
        while (i <= mid && j <= end) {
            // Left element smaller
            if (arr[i] <= arr[j]) { ///// ONE MINOR CLICK HERE, can be resolve by usign else-if
                temp[k] = arr[i];
                i++;
            }
            // Right element smaller
            else {
                temp[k] = arr[j];
                j++;
                // Increase count when Left element > Right element
                count += (mid-i+1);
                /*
                    We used this logic instead of count++ as 
                    if we have 2 sorted subarrays, and the 1st element (Left element) is greater than 1st element of Right array
                */
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
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // Displaying original unsorted array
        // System.out.print("Original Array:\t");
        // for(int i=0; i<arr.length; i++)
        //     System.out.print(arr[i] + "\t");

        // Performing merge sort algorithm on the array, passed by referenc
        int c = mergeSort(arr, 0, arr.length-1, 0);
        System.out.println("Total Inversions = " + c);

        // Displaying Sorted array
        // System.out.print("\nSorted Array:\t");
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + "\t");
        // }
    }
}
