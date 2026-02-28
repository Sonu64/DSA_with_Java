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
        
        System.out.println(ans);
    }
}
