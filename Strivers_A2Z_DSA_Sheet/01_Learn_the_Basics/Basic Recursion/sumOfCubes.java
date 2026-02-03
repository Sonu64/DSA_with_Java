// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class Solution {
    int sumOfSeries(int n) {
        //base case
        if (n==1)
            return 1;
        else
            return ((n*n)*n) + sumOfSeries(n-1);
    }
}