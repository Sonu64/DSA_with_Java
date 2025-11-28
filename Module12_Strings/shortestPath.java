public class shortestPath {
    public static double findShortestPath(String directions, int n) {
        int x = 0, y = 0;
        double shortestPath = 0.0;
        directions = directions.toUpperCase();
        for (int i = 0; i < n; i++) {
            char direction = directions.charAt(i);
            if (direction == 'E')
                x++;
            else if (direction == 'W')
                x--;
            else if (direction == 'N')
                y++;
            else if (direction == 'S')
                y--;
            else
                return -1;

        }
        shortestPath = Math.sqrt((x * x) + (y * y));
        return shortestPath;
    }

    public static void main (String[] args) {
        String direction1 = "WNEEneSENNN";
        String direction2 = "weeZ";
        double sp1 = findShortestPath(direction1, direction1.length());
        double sp2 = findShortestPath(direction2, direction2.length());
        if (sp1 != -1)
            System.out.println("Shortest Path for 1st direction = " + sp1);
        else
            System.out.println("Invalid direction found !");

        if (sp2 != -1)
            System.out.println("Shortest Path for 2nd direction = " + sp2);
        else
            System.out.println("Invalid direction found !");
    }
}
