class Solution {
    public int longestMountain(int[] arr) {
        if(!(arr.length >= 3)) {
            return 0;
        }
        int leftBase = 0, peak = 0, rightBase = 0, i = 0, j = 0;
        int height = 0, maxHeight = Integer.MIN_VALUE;
        while (leftBase < arr.length - 2) {
            if(arr[leftBase] < arr[leftBase+1])
            i = leftBase;
            while(i<arr.length-1 && arr[i] < arr[i+1]) {     
                i++;
            }
            peak = i;
            j = peak;
            while(j<arr.length-1 && arr[j] > arr[j+1]) {                    
                j++;
            }
            rightBase = j;
            height = rightBase-leftBase+1;
            if (height > maxHeight && peak<j) 
                maxHeight = height;
            leftBase++;
        }
        return maxHeight;
    }
}