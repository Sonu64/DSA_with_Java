public class binarySearchC {

    static int performBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + ((end-start)/2);
            if (target < arr[mid])
                end = mid-1;
            else if (target > arr[mid])
                start = mid+1;
            else if(target == arr[mid])
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 10;
        int location = performBinarySearch(arr, target);
        if (location != -1)
            System.out.printf("\n%d is found at index %d.", target, location);
        else
            System.out.printf("\n%d is not found in the array :( ", target);

        System.out.println("\n\nWe are not touching every element. Some elements are skipped/eliminated. So this is an Elimination Algorithm.\n\n_____________________________________________\n\nIf we have K steps, then for Summing up algos, T(n) = No.of Operations performed in K steps. We know the information about K as 'K itself are the total operations. Direct relation between n and k is possible, k is already a found as a function of n' Add all as all elements are touched. T(n) = k = n(n-1)/2\n_____________________________________________\n\nBut for Elimination algos, we don't know anything about K. All we know is Search space after K steps = 1. So T(n) = k, and n/2^k-1=1, so k = logn+1, T(n) = log(n) + 1. We have to explicitly find a relation between n and k and replace k as a function of n in T(n)=k. So T.C for worst case of BinarySearch is O(logn)");
    }
}
