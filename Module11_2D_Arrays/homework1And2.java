public class homework1And2 {
    private static int countOccurences(int key, int arr[][], int rows, int cols) {
        int count = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == key)
                    count++;
        return count;
    }

    public static void main (String[] args) {
        int arr[][] = {
                {8, 8, 9, 10},
                {7, 9, 7, 0},
                {6, 7, 8, 9}
        };
        System.out.println("7 occurs " + countOccurences(7, arr, arr.length, arr[0].length) + " times.");
    }
}
