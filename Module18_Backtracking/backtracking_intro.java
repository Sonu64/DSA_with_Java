public class backtracking_intro {

    static void changeArray(int[] arr, int i, int value) {
        if (i == arr.length) {
            System.out.print("Array just before Backtracking starts - ");
            printArray(arr);
            return;
        }
        else {
            // Filling one value
            arr[i] = value;
            // Going up, Up-tracking with increased params
            changeArray(arr, i+1, value+1); // Recursive call
            // Going down the Tree - Backtracking Step
            arr[i] = arr[i] - 2;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.print("Original Array - ");
        printArray(arr);
        changeArray(arr, 0, 1);
        System.out.print("Changed Array after Backtracking is performed - ");
        printArray(arr);
    }
}