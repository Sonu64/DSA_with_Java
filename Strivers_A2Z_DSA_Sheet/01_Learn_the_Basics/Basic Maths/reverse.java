class reverse {
    public static int reverseNumber(int x) {
        int revNum = 0;
        while (x != 0) {
            int rem = x % 10;
            try {
                revNum = Math.addExact(Math.multiplyExact(revNum, 10), rem);
            }
            catch (ArithmeticException e) {
                return 0;
            }
            
            x = x/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234563399));
    }
}