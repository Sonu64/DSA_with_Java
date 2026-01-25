// https://www.geeksforgeeks.org/problems/count-digits5716/1
class Solution {
  static int evenlyDivides(int n) {
    // code here
    int totalDigits = 0;
    int temp = n;

    while (n > 0) {
      int digit = n % 10;

      if (digit == 0) {
        n /= 10;
        continue;
      } 

      else {
        if (temp % digit == 0)
          totalDigits++;
        n /= 10;
      }

    }
    return totalDigits;
  }
}