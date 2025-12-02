public class getSetBits {

    public static int getBit(int num, int i) {
        int bitMask = (1 << i);
        if ((num & bitMask) != 0) return 1;
        else return 0;
    }

    public static int setBit(int num, int i) {
        int bitMask = (1 << i);
        return (num | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(getBit(7, 2));
        System.out.println(getBit(3, 2));
        System.out.println(setBit(10, 2));
    }
}
