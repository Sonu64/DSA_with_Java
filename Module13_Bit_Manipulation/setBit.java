public class setBit {

    public static int getBit(int num, int i) {
        int bitMask = (1 << i);
        if ((num & bitMask) != 0) return 1;
        else return 0;
    }

    public static int setBitAtPos(int num, int i) {
        int bitMask = (1 << i);
        return (num | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(setBitAtPos(10, 2));
    }
}
