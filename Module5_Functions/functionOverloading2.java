public class functionOverloading2 {

    public static int sum(int a, int b) { return a+b; }
    public static float sum(float a, float b) { return a+b; }

    public static void main(String[] args) {
        int num1 = 12, num2 = 8;
        float num3 = 34.8f, num4 = 0.2f;
        System.out.printf("Sum of %d and %d is %d.\n", num1, num2, sum(num1, num2));
        System.out.printf("Sum of %.2f and %.2f is %.2f.\n", num3, num4, sum(num3, num4));
    }
}
