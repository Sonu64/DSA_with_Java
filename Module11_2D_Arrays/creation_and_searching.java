import java.util.Scanner;

public class creation_and_searching {

    public static void displayMatrix(int matrix[][], int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean search(int key, int matrix[][], int rows, int cols) {
        boolean found = false;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " is found at index " + i + ", " + j + ".");
                    return true;
                }
            }
        }
        System.out.println(key + " is not found in the matrix.");
        return false;
    }


    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Enter Matrix elements rowwise seperated by Space or Enter: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix is - ");
        displayMatrix(matrix, rows, cols);

    

    }


}
