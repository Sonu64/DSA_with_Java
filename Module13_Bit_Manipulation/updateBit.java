public class updateBit {


    public static int updateBit(int num, int position, int newBit) {
        // First clear bit at position position
        num = num & ~(1 << position);

        // Then Calculate new bitmask by left shifting desired bit (1/0) by position positions.
        int bitMask = (newBit << position);
        return (num | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10, 1, 0));
        System.out.println(updateBit(10, 2, 1));
    }
}
