public class minBitsToConvertFromAtoB {
    public static int numOfBitsForConversion(int a, int b) {
        int diffBitNum = a ^ b, count = 0;
        while (diffBitNum != 0) {
            diffBitNum = diffBitNum & (diffBitNum-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of Bits to change from 5 to 9: " + numOfBitsForConversion(5, 9));
    }
}
