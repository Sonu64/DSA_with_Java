public class clearBit {
    public static int clear_bit(int num, int i) {
        int bitMask = (1 << i);
        return (num ^ bitMask);
        // OR return num & ~(1 << i)
    }

    public static void main(String[] args) {
        System.out.println(clear_bit(7, 2));
    }
}
