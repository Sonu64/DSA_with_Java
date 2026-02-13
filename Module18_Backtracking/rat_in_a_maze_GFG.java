import java.util.*;

public class rat_in_a_maze_GFG {
    static ArrayList<String> results = new ArrayList<>();

    // function to check if the cell is safe to go or not
    public static boolean safe(int[][] maze, int i, int j) {
        return (i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == 1);
    }

    // function to check if destination is reached
    public static boolean destinationReached(int[][] maze, int i, int j) {
        return (i == maze.length - 1 && j == maze[0].length - 1);
    }


    // Required recursive function
    public static void solve(int[][] maze, int i, int j, StringBuilder path) {
        
        //..Base Case
        if (!safe(maze, i, j)) return; 

        //..Recursive and Backtracking Steps
        if (destinationReached(maze, i, j)) {
            results.add(path.toString());
            /**  ⚠️⚠️⚠️⚠️ Do not return here ! Allow further backtrackig to clear up the path and mark them back to 1.⚠️⚠️⚠️⚠️ **/
        } else {
            maze[i][j] = 0; // Mark visited

            // Explore in your order: U, D, L, R
            
           
            path.append("U"); //..Do
            solve(maze, i - 1, j, path); //..Explore after doing
            path.deleteCharAt(path.length() - 1); //..Undo

            //..Exploring further options after undoing prev choice
            path.append("D");//..Do
            solve(maze, i + 1, j, path);//..Explore after doing
            path.deleteCharAt(path.length() - 1);//..Undo

            //..Exploring further options after undoing prev choice
            path.append("L");//..Do
            solve(maze, i, j - 1, path);//..Explore after doing
            path.deleteCharAt(path.length() - 1);//..Undo

            //..Exploring further options after undoing prev choice
            path.append("R");//..Do
            solve(maze, i, j + 1, path);//..Explore after doing
            path.deleteCharAt(path.length() - 1);//..Undo

            maze[i][j] = 1; // Unmark visited (Backtrack)
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maze size: ");
        int n = in.nextInt();
        int[][] maze = new int[n][n];

        System.out.println("Enter maze values (1/0):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = in.nextInt();
            }
        }

        results.clear();

        if (maze[0][0] == 1 && maze[n - 1][n - 1] == 1) {
            solve(maze, 0, 0, new StringBuilder(""));
        }

        // Sorting lexicographically
        Collections.sort(results);

        System.out.println("\nSorted Paths:");
        if (results.isEmpty()) {
            System.out.println("-1");
        } else {
            for (String p : results) {
                System.out.println(p);
            }
        }
        in.close();
    }
}