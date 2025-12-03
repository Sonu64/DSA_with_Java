public class clear_Last_i_Bits {
    public static int clearLast_i_Bits(int num, int i) {
        int bitMask = ((-1) << i); // OR (~0 << i)
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLast_i_Bits(5, 1));
        System.out.println(clearLast_i_Bits(7, 1));
        System.out.println(clearLast_i_Bits(15, 3));
    }
}
