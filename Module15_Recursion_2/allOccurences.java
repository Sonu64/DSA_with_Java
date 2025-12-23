import java.util.*;

public class allOccurences {

    public static void printAllOccurences(int[] arr, int target, int index) {
        // Base Case
        if (index == arr.length-1) {
            if (arr[index] == target) {
                System.out.print(index + " ");
                return;
            }
        }
        else {
            if (arr[index] == target)
                System.out.print(index + " ");
            printAllOccurences(arr, target, index+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        // Fill the array with numbers between 1 and 30
        // Since we are putting 50 numbers into the array but only picking
        // from 30 possible values, repeats are guaranteed.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30) + 1;
        }
        System.out.println("Array is - ");
        System.out.println(Arrays.toString(arr));
        System.out.print("\nEnter Target Element: ");
        int target = in.nextInt();
        System.out.println("Indices where " + target + " occur in the Array - ");
        printAllOccurences(arr, target, 0);

    }


}
