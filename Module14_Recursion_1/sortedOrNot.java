public class sortedOrNot {
    public static boolean isSorted(int[] arr, int n) {
//        n = arr.length;
        boolean isSorted = false;

        if (n == 0) {
            if (arr[n] < arr[n+1])
                return true;
            else
                return false;
        }
        else
            return (isSorted(arr, n) && isSorted(arr, n-1));
    }

    public static void main (String[] args) {
        int arr[] = {1, 22, 34, 78};
        System.out.println(isSorted(arr, arr.length));
    }
}
