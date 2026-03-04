import java.util.ArrayList;
import java.util.Arrays;

public class Monotonic {
  private static boolean isMonotonic(ArrayList<Integer> nums) {

    boolean isIncreasing = true;
    boolean isDecreasing = true;

    for (int i = 0; i < nums.size() - 1; i++) {
      if (nums.get(i) > nums.get(i + 1)) {
        isIncreasing = false;
        break;
      }
    }

    if (!isIncreasing)
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                isDecreasing = false;
                break;
            }
        }

    if (isIncreasing) {
        System.out.println("Purely Increasing...");
        return true;
    }
    else if (isDecreasing) {
        System.out.println("Purely Decreasing...");
        return true;
    }
    else
        return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    if (isMonotonic(nums))
      System.out.println("Given ArrayList is Monotonic :) ");
    else
      System.out.println("Given ArrayList is Not Monotonic. :( ");
  }
}
