// https://www.geeksforgeeks.org/problems/merge-sort/1

class Solution {

    void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end-start+1];
        int i = start; // Left Array Iterator
        int j = mid+1; // Right Array Iterator
        int k = 0; // Temp Iterator
        
        while(i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // Elements left in LEFT Array
        while (i<=mid)
            temp[k++] = arr[i++];
        
        
        // Elements left in RIGHT Array
        while (j<=end)
            temp[k++] = arr[j++];
            
        for(int tempIterator = 0, copyingIterator = start; tempIterator<temp.length; tempIterator++, copyingIterator++) {
            arr[copyingIterator] = temp[tempIterator];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        int start = l;
        int end = r;
        sort(arr, start, end);
        
    }
    
    void sort(int arr[], int start, int end) {
        if(start >= end) return;
        
        int mid = start + ((end-start)/2);
        
        sort(arr, start, mid);
        sort(arr, mid+1, end);
        
        merge(arr, start, mid, end);
    }
}