public class tilingProblem {
    public static int numberOfWays(int n) {
        // code here
        if (n==0 || n==1) return 1;


        // Choice of Vertical
        int verticalWays = numberOfWays(n-1);
        // Choice of Horizontal
        int horizontalWays = numberOfWays(n-2);

        return (verticalWays + horizontalWays);
    }

    public static void main(String[] args) {
        System.out.println(numberOfWays(4));
    }
};