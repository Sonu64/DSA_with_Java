import java.util.*;
public class MostFrequentNumberFollowingKey {
  private static int solve(List<Integer> nums, int key) {
    Set<Integer> set = new HashSet<>(nums);
    ArrayList<Integer> newList = new ArrayList<>(set);

    int maxCount = Integer.MIN_VALUE;

    int number = -1;

    for (int i = 0; i < newList.size(); i++) {
      int count = 0;
      int target = newList.get(i);
      for (int j = 0; j < nums.size() - 1; j++) {
        if (nums.get(j) == key && nums.get(j + 1) == target)
          count++;
        if (count > maxCount) {
          maxCount = count;
          number = target;
        }
      }

      // System.out.println(number);
    }
    return number;
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums =
        new ArrayList<>(Arrays.asList(1, 100, 200, 1, 100));

    System.out.println(solve(nums, 2));
  }
}
