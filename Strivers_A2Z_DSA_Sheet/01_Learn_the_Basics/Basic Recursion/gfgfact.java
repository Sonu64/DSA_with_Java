// User function Template for Java
// https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> factorialList = new ArrayList<>();
        
        for (long i=1; i <= n; i++) {
            long temp = f(i); // Seperate variable need it must to avoid Double Calls !
            if (temp > n)
                break; // break needed to ignore Useless-overhead calls.
            factorialList.add(temp);
        }
        
        return factorialList;
    }
    
    static long f(long n) {
        if (n==0 || n==1)
            return 1;
        return (n * f(n-1));
    }
}