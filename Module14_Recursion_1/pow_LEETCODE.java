class Solution {

    public double myRealPow(double x, long n) {
        if (n==0)
            return 1;
        if(n==1)
            return x;
        
        double halfPower = myRealPow(x, n/2);
        if(n%2==0)
            return (halfPower * halfPower);
        else
            return (halfPower * halfPower * x);

    }

    public double myPow(double x, int n) {
        long N = n; // to avoid Overflow Errors if n = Integer.MIN_VALUE
        if (n < 0) {
            return myRealPow(1/x, Math.abs(N));
        }
        else {
            return myRealPow(x, N);
        }
    }
}