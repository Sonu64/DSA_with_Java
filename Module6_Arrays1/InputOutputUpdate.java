import java.util.Scanner;

public class InputOutputUpdate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int SIZE = 5, MAX_SIZE = 100;
        int marks[] = new int[MAX_SIZE];
        // Taking Input
        for(int i=0; i<SIZE; i++) {
            System.out.print("Enter marks["+i+"]: ");
            marks[i] = in.nextInt();
        }
        System.out.println();
        // Showing Output
        System.out.println("Old Array Elements - ");
        for(int i=0; i<SIZE; i++) {
            System.out.printf("marks[%d] = %d\n", i, marks[i]);
        }

        // Updating Last Element and 2nd element
        marks[SIZE-1] = 999;
        marks[1] = 99;
        System.out.println("\nNew Array Elements - ");
        for(int i=0; i<SIZE; i++) {
            System.out.printf("marks[%d] = %d\n", i, marks[i]);
        }

        // Capacity of Array
        System.out.println("\nCapacity of the Array is " + marks.length + ". ");
    }
}
