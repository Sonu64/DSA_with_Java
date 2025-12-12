public class decreasingNumbers {
    public static void printPrev(int n) {
        if (n==1) {
            System.out.print(1 + "\t");
            return;
        }
        else {
            System.out.print(n + "\t");
            printPrev(n - 1);
        }
    }

    public static void main(String[] args) {
        printPrev(10);
    }
}
