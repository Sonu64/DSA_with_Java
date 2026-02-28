import java.util.*;

public class ContainerWithMostWater {

    // Brute Force Approach !
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

    public static void main(String[] args) {

        ArrayList<Integer> lines = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int ans = solve(lines);
        System.out.println(ans);
    }
}
