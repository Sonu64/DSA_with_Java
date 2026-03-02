import java.util.*;

public class ContainerWithMostWater {

    // Brute Force Approach ! --> O(n^2)
    static int solve(ArrayList<Integer> lines) {
 
    int waterAmount = Integer.MIN_VALUE;

    for(int i = 0; i < lines.size()-1; i++) {
        int leftLine = lines.get(i);
        for(int j = i+1; j < lines.size(); j++) {
            int rightLine = lines.get(j);
            int width = j - i;
            int height = Math.min(leftLine, rightLine);
            int currWater = width * height;
            waterAmount = Math.max(currWater, waterAmount);
        }

    }
    return waterAmount;
}


    // 2-Pointer Approach !! --> O(n)
    private static int solveUsing2Pointer(ArrayList<Integer> heights) {
        int n = heights.size();
        int leftPointer = 0;
        int rightPointer = n-1;
        int currWater = 0;
        int maxWater = 0;
        while(leftPointer <= rightPointer) {
            int height = Math.min(heights.get(leftPointer), heights.get(rightPointer));
            int width = rightPointer - leftPointer;
            currWater = height*width;
            maxWater = Math.max(currWater, maxWater);
            if (heights.get(leftPointer) < heights.get(rightPointer))
                leftPointer++;
            else
                rightPointer--;
        }
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lines = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int ans1 = solve(lines);
        System.out.println(ans1);

        int ans2 = solveUsing2Pointer(lines);
        System.out.println(ans2);
    }
}
