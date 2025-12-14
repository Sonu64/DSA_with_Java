public class firstOccurence {
    public static int find_first_occurence(int[] arr, int target, int n) {
        if (n == arr.length-1 && arr[n] != target)
            return -1;
        if (arr[n] == target)
            return n;
        else
            return find_first_occurence(arr, target, n+1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 6, 7, 6};
        System.out.println(find_first_occurence(arr, 16, 0));
    }
}
