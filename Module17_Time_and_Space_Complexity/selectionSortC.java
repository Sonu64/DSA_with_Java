public class selectionSortC {
    
    static void performSelectionSort(int[] arr) {
        int i = 0, j = 0;
        for(i = 0; i<arr.length-1; i++) {
            int smallestIndex = i;
            for(j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    static void displayArray(int[] arr) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "\t");
    }
    
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 56, 90};
        System.out.println("\nOriginal Array - ");
        displayArray(arr);
        performSelectionSort(arr);
        System.out.println("\nSorted Array - ");
        displayArray(arr);
        System.out.println("\n\nGrowth Factor g(n) for Both Best and Worst Cases of Selection sort is n^2.So,- \nBest Case Complexity = BigOmega(n^2)\nWorst Case Complexity = BigO(n^2)");
    }
}
