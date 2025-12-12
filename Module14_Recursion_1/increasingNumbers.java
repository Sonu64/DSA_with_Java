public class increasingNumbers {
    public static void nextNum(int n) {
        if (n == 10) {
            System.out.print(10 + "\t");
            return;
        }
        else {
            System.out.print(n + "\t");
            nextNum(n+1);
        }
    }

    public static void main (String[] args) {
        nextNum(1);
    }
}
