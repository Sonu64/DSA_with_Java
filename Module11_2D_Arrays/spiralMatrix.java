public class spiralMatrix {

    public static void printSpiral(int arr[][], int rows, int cols) {
        int startingRow = 0, endingRow = rows - 1;
        int startingCol = 0, endingCol = cols - 1;
        while (startingRow <= endingRow && startingCol <= endingCol) {
            // Print TOP
            for (int j = startingCol; j <= endingCol; j++) {
                System.out.print(arr[startingRow][j] + "  ");
            }
            startingRow++;

            // Print RIGHT, startingRow+1 as 1st element of starting row already printed
            for (int i = startingRow; i <= endingRow; i++) {
                System.out.print(arr[i][endingCol] + "  ");
            }
            endingCol--;
            // Print BUTTOM, endingCol-1 as RIGHT printing already printed arr[endingRow][endingCol]
            // For Single Row, don't print buttom
            if (startingRow <= endingRow) {
                for (int j = endingCol; j >= startingCol; j--) {
                    System.out.print(arr[endingRow][j] + "  ");
                }
                endingRow--;
            }
            // Print LEFT, endingRow-1 as BUTTOM printed arr[endingRow][startingCol]
            // startingRow+1 as the 1st element already printed by TOP
            if (startingCol <= endingCol) {
                for (int i = endingRow; i >= startingRow; i--) {
                    System.out.print(arr[i][startingCol] + "  ");
                }
                startingCol++;
            }
        }
    }

    public static void main (String[] args) {
        int arr[][] = {
                {1},
                {2},
                {3}
        };
        printSpiral(arr, arr.length, arr[0].length);
        System.out.println("\n\n");


        int arr2[][] = {
                {1, 2, 3}
        };
        printSpiral(arr2, arr2.length, arr2[0].length);
        System.out.println("\n\n");


        int arr3[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printSpiral(arr3, arr3.length, arr3[0].length);
        System.out.println("\n\n");
    }
}
