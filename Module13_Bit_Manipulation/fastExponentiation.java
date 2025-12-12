public class fastExponentiation {

    public static double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double val = 1;
        while (n != 0) {
            // Checking LSB
            if ((n & 1) != 0)
                val *= x;
            x *= x;
            n = n >> 1;
        }
        return val;
    }

    public static void main (String[] args) {
        System.out.println(myPow(3.0, 3));
    }
}
