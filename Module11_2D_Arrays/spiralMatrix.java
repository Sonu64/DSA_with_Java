public class spiralMatrix {

    public static void printSpiral(int arr[][], int rows, int cols) {
        int startingRow = 0, endingRow = rows - 1;
        int startingCol = 0, endingCol = cols - 1;
        while (startingRow <= endingRow && startingCol <= endingCol) {
            // Print TOP
            for (int j = startingCol; j <= endingCol; j++) {
                System.out.print(arr[startingRow][j] + "  ");
            }
            // Print RIGHT, startingRow+1 as 1st element of starting row already printed
            for (int i = startingRow + 1; i <= endingRow; i++) {
                System.out.print(arr[i][endingCol] + "  ");
            }
            // Print BUTTOM, endingCol-1 as RIGHT printing already printed arr[endingRow][endingCol]
            for (int j = endingCol - 1; j >= startingCol; j--) {
                System.out.print(arr[endingRow][j] + "  ");
            }
            // Print LEFT, endingRow-1 as BUTTOM printed arr[endingRow][startingCol]
            // startingRow+1 as the 1st element already printed by TOP
            for (int i = endingRow - 1; i >= startingRow + 1; i--) {
                System.out.print(arr[i][startingCol] + "  ");
            }

            startingRow++;
            endingRow--;
            startingCol++;
            endingCol--;
        }
    }

    public static void main (String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printSpiral(arr, arr.length, arr[0].length);
    }
}
