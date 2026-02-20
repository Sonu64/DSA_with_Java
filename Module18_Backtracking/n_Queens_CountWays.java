public class n_Queens_CountWays {
    //..Global Results Array
    static int count = 0;

    public static void solve(char[][] board, int row, int n) {
        // Base Case: All queens placed
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (notUnderAttack(board, row, col, n)) {
                // Do
                board[row][col] = 'Q';
                
                // Explore with Done
                solve(board, row + 1, n);
                
                // Undo (Backtrack) with undoing above step
                board[row][col] = '.';
            }
        }
    }


    private static boolean notUnderAttack(char[][] board, int row, int col, int n) {
        // Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }
        // Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        // Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    public static int countWays(int n) {
        // 1. Create a 2D char array (much easier to modify!)
        // This is mandatory for the backtracking to work, as we need to mark placements and undo them. This is not possible with only the number n. --> Don't confuse with Grid-Ways where no checking is needed, we just need to move in 2 or 4 directions.
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0, n);
        return count;
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        int count = countWays(n);
        System.out.println(count);
    }
}