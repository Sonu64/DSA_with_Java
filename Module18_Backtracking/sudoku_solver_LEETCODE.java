class Solution {

    //..Function to check wheather we can put the number @ a position or not
    public boolean isSafe(char[][] board, int rowIndex, int colIndex, int digit) {
        //..Rowwise Check
        for(int colNum=0; colNum<9; colNum++) {
            if(board[rowIndex][colNum] == (char)(digit+'0') && colNum != colIndex) 
                return false;
        }
        //..Columnwise Check
        for(int rowNum=0; rowNum<9; rowNum++) {
            if(board[rowNum][colIndex] == (char)(digit+'0') && rowNum != rowIndex)
                return false;
        }
        //..Box-wise check
        int startRow = (rowIndex / 3) * 3;
        int startCol = (colIndex / 3) * 3;
        for(int i=startRow; i<(startRow+3); i++) {
            for(int j=startCol; j<(startCol+3); j++) {
                if(board[i][j] == (char)(digit+'0'))
                    return false;
            }
        }
        return true;
    }

    //...Backtracking and Recursive function
    public boolean solve(char[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if (board[i][j] != '.') continue;
                for(int d=1; d<=9; d++) {
                    if (isSafe(board, i, j, d)) {
                        board[i][j] = (char)( d + '0'); //Do
                        if(solve(board) == true) return true; ///Explore
                        board[i][j] = '.';//Undo
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board); // Inside this function call, the 2D char array is modified :)
        // So we don't need a global results array of some sort, as there is only one solution.
    }
}