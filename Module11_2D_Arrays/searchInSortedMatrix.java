public class searchInSortedMatrix {

    private static void stairCaseSearch(int key, int[][] arr, int rows, int cols) {
        int rowIndex = 0, colIndex = cols-1;
        while (rowIndex < rows && colIndex >= 0) {
            if (key < arr[rowIndex][colIndex]) {
                // Move LEFT
                colIndex--;
            }
            else if (key > arr[rowIndex][colIndex]){
                // Move DOWN

                rowIndex++;
            }
            else {
                System.out.println(key + " is found at Position " + rowIndex + ", " + colIndex + ".");
                return;
            }
        }
        System.out.println(key + " is not found in the matrix.");
    }

    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        stairCaseSearch(3, arr, arr.length, arr[0].length);
    }
}
