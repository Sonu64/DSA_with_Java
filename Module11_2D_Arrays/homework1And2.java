public class homework1And2 {
    private static int countOccurences(int key, int arr[][], int rows, int cols) {
        int count = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == key)
                    count++;
        return count;
    }


    private static int sumOf2ndRow(int arr[][], int rows, int cols) {
        int sum = 0;
        for (int j = 0; j < cols; j++)
            sum += arr[1][j];
        return sum;
    }

    public static void main (String[] args) {
        int arr[][] = {
                {8, 8, 9, 10},
                {7, 9, 7, 0},
                {6, 7, 8, 9}
        };
        System.out.println("7 occurs " + countOccurences(7, arr, arr.length, arr[0].length) + " times.");
        System.out.println("Sum of 2nd Row of the Matrix is " + sumOf2ndRow(arr, arr.length, arr[0].length) + ".");
    }
}
