import java.util.*;

public class PairSum {

    // Brute Force Approach
    static ArrayList<Integer> solve(List<Integer> nums, int targetSum) {
        ArrayList<Integer> pair = new ArrayList<>();
        for(int i=0; i<nums.size()-1; i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == targetSum) {
                    pair.add(nums.get(i));
                    pair.add(nums.get(j));
                    return pair;
                }
            }
        }
        return pair;
    }

    // Two-Pointer Approach
    static ArrayList<Integer> solveUsing2Pointer(List<Integer> nums, int targetSum) {
        int leftPointer = 0;
        int rightPointer = nums.size()-1;
        // At some point we must return the array
        // containing left and right pointers.
        while(leftPointer <= rightPointer) {
            int sum = nums.get(leftPointer) + nums.get(rightPointer);
            if (sum == targetSum) {
                 // Found => Return 1-based indices
                ArrayList<Integer> answer = new ArrayList<>();
                answer.add(leftPointer);
                answer.add(rightPointer);
                return answer;
            }  
            else if (sum < targetSum) {
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        // No solution found !
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(-1);
        answer.add(-1);
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int targetSum = 10;

        ArrayList<Integer> ans = solve(list, targetSum);
        ArrayList<Integer> ans2 = solve(list, targetSum);
        
        System.out.println("Result using Brute Force Approach = " + ans);
        System.out.println("Result using 2-Pointer Approach = " + ans2);
        System.out.println("P.S:- For this to work, the Array/ArrayList must be sorted !");
    }
}
