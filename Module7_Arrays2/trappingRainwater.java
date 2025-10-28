public class trappingRainwater {
    public static int trappedWater(int heights[], int SIZE) {

        // Calculate the Max Left Auxilliary Array
        int leftMax[] = new int[SIZE];
        leftMax[0] = heights[0];
        for (int i = 1; i < SIZE; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

        // Calculate the Max Right Auxilliary Array
        int rightMax[] = new int[SIZE];
        rightMax[SIZE-1] = heights[SIZE-1];
        for (int i = SIZE-2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        // Create an array for the water level over every bar from the ground
        int waterLevelsAboveGround[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            waterLevelsAboveGround[i] = Math.min(leftMax[i], rightMax[i]);
        }

        // Calculate water level over every bar Above the bar height
        int waterLevels[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            waterLevels[i] = waterLevelsAboveGround[i] - heights[i];
        }

        // Calculate total water trapped
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += waterLevels[i];
        }
        return sum;
    }

    public static void main (String[] args) {
        int myBars[] = {4, 2, 0, 6, 3, 2, 5};
        int trappedWater = trappedWater(myBars, myBars.length);
        System.out.println("Total Rainwater trapped between bars = " + trappedWater);
    }
}
