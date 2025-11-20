package tools;

/* We can inherit top level public/default classes within the same pkg without any import.*/
public class AdvCalc extends Calc {
    public int multiply(int n1, int n2) { return n1 * n2; }
    public int divide(int n1, int n2) { return n1 / n2; }
    public void showTest() {
        test(); // default
    }
}
