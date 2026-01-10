public class majority_element {

  public static int findMajority(int[] arr, int start, int end) {

        if (start == end) return arr[start];

        int mid = start + ((end - start) / 2);

        int threshold = (end - start) / 2;
        int countLeft = 0, countRight = 0;

        // Don't set this equal to mid, remember mid is an index position, while threshold is count !!
    
        int leftMajority = findMajority(arr, start, mid);
        int rightMajority = findMajority(arr, mid + 1, end);
    
        if (leftMajority == rightMajority) {
            int count = 0;
            for (int i = start; i <= end; i++)
                if (arr[i] == leftMajority)
                    count++;
            if (count > threshold)
                return leftMajority; // or rightMajority
        } 


        else {
            for (int i = start; i <= end; i++) {
                if (arr[i] == leftMajority)
                    countLeft++;
                else if (arr[i] == rightMajority)
                    countRight++;
            }
        }


        if (countLeft > countRight && countLeft > threshold) return leftMajority;

        else if (countRight > countLeft && countRight > threshold) return rightMajority;

        return -1;
}

  public static int findMajorityElement(int[] arr) {
    return findMajority(arr, 0, arr.length-1);
  }

  public static void main(String[] args) {
    int[] arr = {
      2, 13, 13
    };
    System.out.println(findMajorityElement(arr));
  }
}