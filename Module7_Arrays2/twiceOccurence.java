public class twiceOccurence {

    public static boolean isTwice(int arr[], int SIZE) {
        boolean twiceOccurence = false;
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if (i == j)
                    continue;
                if (arr[j] == arr[i]) {
                    twiceOccurence = true;
                    break;
                }
            }
        }
        return twiceOccurence;

    }

    public static void main (String[] args) {
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isTwice(arr, arr.length));
    }
}
