class Solution {
    
    
    public void subsets(int[] arr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> results , int i) {
        
        if(i == arr.length) {
            results.add(new ArrayList<>(temp)); // we want a copy to be added ! Not actual temp !
            return;
        }
        
        // Character chosen
        temp.add(arr[i]);
        subsets(arr, temp, results, i+1);
        // Character not chosen
        temp.remove(temp.size()-1);
        subsets(arr, temp, results, i+1);
        
    }
    
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // temp only needs capacity for 'n' elements
        ArrayList<Integer> temp = new ArrayList<>(arr.length); 
        // ans can benefit from the 2^n capacity to avoid resizing
        int totalSubsets = (int)Math.pow(2, arr.length);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(totalSubsets);
        subsets(arr, temp, ans, 0);
        return ans;
        
    }
}