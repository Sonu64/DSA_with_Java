import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumber {
    

    private static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        

        for(int i=0; i<nums.size(); i++) {
            boolean duplicateExists = false;
            int curr = nums.get(i);
            for(int j=0; j<nums.size(); j++) {
                if (nums.get(j) == curr && j != i) {
                    duplicateExists = true;
                    break;
                }
            }
            if (!nums.contains(curr+1) && !nums.contains(curr-1) && !duplicateExists) {
                ans.add(curr);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(lonelyNumbers(new ArrayList<>(Arrays.asList(1,3, 5, 3))));
    }
}
