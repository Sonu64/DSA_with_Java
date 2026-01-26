// Brute-force approach is easy -  O(n^2)
// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

class Solution {
    public static long sumOfDivisors(long n) {
        long totalSum = 0;
        for (int i = 1; i <= n; i++) {
            // 'i' appears as a divisor exactly (n/i) times
            totalSum += (long) i * (n / i);
        }
        return totalSum;
    }
}