public class singleNumber2 {
    public static int findUnique(int[] arr) {

            int result = 0;
            for(int bitPosition=0; bitPosition<32; bitPosition++) {
                int bitCount = 0;
                for(int num : arr) {
                    if ((num & (1 << bitPosition)) != 0)
                        bitCount++;
                }
                bitCount %= 3;
                if (bitCount == 1)
                    result = result ^ (1 << bitPosition);
            }
            return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,2,3,4,3,3,4,4, 1, 1, 5};
        System.out.println("Unique Element in the array is " + findUnique(arr) + ".");
    }
}
