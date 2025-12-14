public class sortedOrNot {
    public static boolean isSorted_from_end(int[] arr, int n) {
        if (n <= 1)
            return true;
        int i = n-2;
        if (arr[i+1] < arr[i])
            return false;
        return isSorted_from_end(arr, n-1);
    }

    public static void main (String[] args) {
        int arr[] = {1, 2};
//        System.out.println(isSorted_from_beginning(arr, 0));
        System.out.println(isSorted_from_end(arr, arr.length));
    }
}
