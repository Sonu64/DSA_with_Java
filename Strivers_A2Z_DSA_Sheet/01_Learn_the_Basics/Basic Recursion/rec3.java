// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop

class Solution {

    void printNos(int N) {
        // code here
        int n = N;
        if (n==1)
            System.out.print(1 + " ");
        else {
            System.out.print(n + " ");
            printNos(n-1);
        }
    }
}