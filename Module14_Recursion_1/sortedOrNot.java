public class sortedOrNot {
    public static boolean isSorted(int[] arr, int n) {
        int i = n-2;
        boolean isSorted = false;

        if (i == 0) {
            if (arr[i] < arr[i+1])
                return true;
            else
                return false;
        }
        else {
            if (arr[i] < arr[i+1])
                isSorted = true;
            return (isSorted && isSorted(arr, n-1));
        }
    }


    
    public static void main (String[] args) {
        int arr[] = {1, 22, 115, 900, 1000, 1001, 9};
        System.out.println(isSorted(arr, arr.length));
    }
}
