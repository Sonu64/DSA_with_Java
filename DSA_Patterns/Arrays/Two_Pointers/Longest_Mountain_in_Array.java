class Solution {
  public int longestMountain(int[] arr) {
    
    if (!(arr.length >= 3)) {
      return 0;
    }

    int i = 1, peak = 0, maxLength = 0;
    while (i < arr.length-1) {
      if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
        peak = i;
        int left = peak - 1;
        int right = peak + 1;
        // Boundary checks below are also important ! And these dont make complexity O(n^2), they are
        // simply overwriting, not "processing" those elements back again !
        while (left > 0 && arr[left - 1] < arr[left]) left--;
        while (right < arr.length-1 && arr[right + 1] < arr[right]) right++;
        int currentLength = right - left + 1;
        maxLength = (currentLength > maxLength) ? currentLength : maxLength;
      }
      i++;
    }
    return maxLength;
  }
}