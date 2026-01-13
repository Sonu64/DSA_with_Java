public class bubbleSortC {
    
    static void performBubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void performOptimizedBubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                System.out.println("\nSkipped Unneccesary Comparisons, as at i = " + i + ", Array is already Sorted :) It became already Sorted at i = " + (i-1));
                break;
            }
        }
    }

    static void displayArray(int[] arr) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "\t");
    }
    
    public static void main(String[] args) {
        int[] arr = {34, 45, 41, 21, 67, 56};
        int[] arr2 = {1, 2, 4, 3, 5, 6};

        System.out.println("Original Array - ");
        displayArray(arr);

        performBubbleSort(arr);
        System.out.println("\nArray after Sorting using Normal Bubble Sort  - ");
        displayArray(arr);
        System.out.println("\nWorst-Case Complexity = O(n^2)\nBest-Case Complexity = O(n^2)\n\n");

        System.out.println("Original Array - ");
        displayArray(arr2);

        performOptimizedBubbleSort(arr2);
        System.out.println("\nArray after Sorting using Optimized Bubble Sort  - ");
        displayArray(arr2);
        System.out.println("\nWorst-Case Complexity = O(n^2)\nBest-Case Complexity = O(n)\n\n");


    }
}