public class merge_sort_strings {
    
    public static void mergeSortStrings(String[] arr, int start, int end) {
        if (start >= end) return;
        int mid = start + ((end-start)/2);
        mergeSortStrings(arr, start, mid);
        mergeSortStrings(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(String[] arr, int start, int mid, int end) {
        String[] temp = new String[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Elements Left in Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Elements Left in Right Part
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy elements from temp to main array
        for(int ti = 0, ci = start; ti < temp.length; ti++, ci++) 
            arr[ci] = temp[ti];
    }
    
    public static void main(String[] args) {
        String[] arr = {"listen", "silent", "enlist", "tinsel"};

        System.out.print("Original Array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%s\t", arr[i]);
        }

        System.out.println();
        mergeSortStrings(arr, 0, arr.length-1);

        
        System.out.print("Sorted Array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%s\t", arr[i]);
        }
    }
}
