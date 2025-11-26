public class transpose {

    private static int[][] findTranspose(int matrix[][], int rows, int cols) {
        int transpose[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }


    // Transpose in-place
    private static void transposeInPlace(int matrix[][], int rows, int cols) {
        int temp = 0;
        for (int i = 0; i < rows; i++) {
            // i+1 because we have to skip swapping the elements already in correct position.
            for (int j = i + 1; j < cols; j++) { 
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    public static void displayMatrix(int matrix[][], int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int transpose[][] = findTranspose(arr, arr.length, arr[0].length);
        displayMatrix(transpose, transpose.length, transpose[0].length);
        transposeInPlace(arr, arr.length, arr[0].length);
        System.out.println();
        displayMatrix(arr, arr.length, arr[0].length);
    }
}
