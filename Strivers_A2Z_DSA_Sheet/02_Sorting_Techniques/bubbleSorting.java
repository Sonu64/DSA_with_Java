// https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort

class Solution {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++)  {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}