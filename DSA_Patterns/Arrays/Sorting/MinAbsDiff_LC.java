import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minAbsDiff = Integer.MAX_VALUE;
        int N = arr.length;
        List<List<Integer>> answer = new ArrayList<>();
        
        /**
        Why Sort? The minimum difference must occur between adjacent elements in a sorted sequence. This collapses an O(N^2) brute-force search into an efficient O(NlogN) operation. 
        */
        Arrays.sort(arr);

        // Finding global minimum Absolute Difference
        for(int i=0; i<N-1; i++) {
            if(Math.abs(arr[i]-arr[i+1]) < minAbsDiff)
                minAbsDiff = Math.abs(arr[i]-arr[i+1]);
        }

        // Collecting all pairs
        for(int i=0; i<N-1; i++) {
            if(Math.abs(arr[i]-arr[i+1]) == minAbsDiff) 
                answer.add(Arrays.asList(arr[i], arr[i+1]));
        }
        return answer;
    }
}