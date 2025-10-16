public class functionOverloading1 {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) { return a+b+c; }

    public static void main(String[] args) {
        System.out.println("2 numbers Sum = " + sum(10, 20));
        System.out.println("3 numbers Sum = " + sum(10, 20, 30));
    }
}
