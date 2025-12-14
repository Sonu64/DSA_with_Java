public class lastOccurence {
    public static int find_last_occurence(int[] arr, int target, int n) {
        int i = n-1;
        int index = 0;
        if (arr[i] == target)
            return i;
        else
            return find_last_occurence(arr, target, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 6, 7, 6};
        System.out.println(find_last_occurence(arr, 6, arr.length));
    }
}
