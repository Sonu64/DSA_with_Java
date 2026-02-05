// https://www.geeksforgeeks.org/problems/selection-sort/1
class Solution {
    void selectionSort(int[] arr) {
        // code here
        int minIndex = -1;
        for(int i=0; i<arr.length-1; i++) {
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}