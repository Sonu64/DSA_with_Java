/* Compile-Time Polymorphism: Method Overloading */

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator_ myCalculator = new Calculator_();
        int twoIntSum = myCalculator.add(34, 6);
        float twoFloatSum = myCalculator.add(34.2f, 5.8f);
        int threeIntSum = myCalculator.add(23, 7, 20);

        System.out.println("Two Int Sum: " + twoIntSum);
        System.out.println("Two Float Sum: " + twoFloatSum);
        System.out.println("Three Int Sum: " + threeIntSum);
    }
}

class Calculator_ {
    int add(int a, int b) {
        return a+b;
    }
    float add(float a, float b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
}



