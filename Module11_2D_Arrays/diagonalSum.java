import java.util.Scanner;

public class diagonalSum {

    public static int primaryDiagonalSum(int arr[][], int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (i == j)
                    sum += arr[i][j];
        }
        return sum;
    }

    public static int secondaryDiagonalSum(int arr[][], int rows, int cols) {
        int sum = 0;
        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            if (i != j) {
                sum += arr[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }

    public static int optimizedDiagonalSum(int arr[][], int rows, int cols) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[2][2];
        int primaryDiagonalSum1 = 0, primaryDiagonalSum2 = 0;
        int secondaryDiagonalSum1 = 0, secondaryDiagonalSum2 = 0;
        int diagonalSums1 = 0, diagonalSums2 = 0;

        System.out.println("Enter 3x3 Matrix elements rowwise seperated by Space or Enter: ");
        for(int i=0; i < matrix1.length; i++) {
            for(int j=0; j < matrix1[0].length; j++)
                matrix1[i][j] = in.nextInt();
        }
        primaryDiagonalSum1 = primaryDiagonalSum(matrix1, matrix1.length, matrix1[0].length);
        System.out.println("Primary Diagonal Sum = " + primaryDiagonalSum1);
        secondaryDiagonalSum1 = secondaryDiagonalSum(matrix1, matrix1.length, matrix1[0].length);
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonalSum1);
        diagonalSums1 = primaryDiagonalSum1 + secondaryDiagonalSum1;
        System.out.println("Diagonal Sum = " + diagonalSums1);
        System.out.println("\n");


        System.out.println("Enter 2x2 Matrix elements rowwise seperated by Space or Enter: ");
        for(int i=0; i < matrix2.length; i++) {
            for(int j=0; j < matrix2[0].length; j++)
                matrix2[i][j] = in.nextInt();
        }
        primaryDiagonalSum2 = primaryDiagonalSum(matrix2, matrix2.length, matrix2[0].length);
        System.out.println("Primary Diagonal Sum = " + primaryDiagonalSum2);
        secondaryDiagonalSum2 = secondaryDiagonalSum(matrix2, matrix2.length, matrix2[0].length);
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonalSum2);
        diagonalSums2 = primaryDiagonalSum2 + secondaryDiagonalSum2;
        System.out.println("Diagonal Sum = " + diagonalSums2);
    }
}
