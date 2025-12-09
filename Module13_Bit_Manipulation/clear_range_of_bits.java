public class clear_range_of_bits {
    public static int clearBits(int num, int i, int j) {
        // Create a Set of i 1s, from 0 to index i-1
        int lowerBlock = (1 << i) - 1;
        // Create a Set of j 1s, from index j+1 to the end
        int upperBlock = (-1 << (j+1));
        int bitMask = lowerBlock | upperBlock;
        int result = num & bitMask;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(clearBits(15, 1, 2)); // 9
    }
}
