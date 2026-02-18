class Solution {
    //..Global Results Array
    List<List<String>> results = new ArrayList<>();

    public void solve(char[][] board, int row, int n) {
        // Base Case: All queens placed
        if (row == n) {
            results.add(construct(board)); // Convert to List<String> here
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

    // This helper converts the 2D array to the specific List<String> format.
    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i])); // Converts one char row into a String
        }
        return res;
    }

    private boolean notUnderAttack(char[][] board, int row, int col, int n) {
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

    public List<List<String>> solveNQueens(int n) {
        results.clear();
        // 1. Create a 2D char array (much easier to modify!)
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0, n);
        return results;
    }
}