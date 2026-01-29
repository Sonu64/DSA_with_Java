// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times

class Solution {

    void printGfg(int N) {
        // code here
        int n = N;
        if (n==0)
            System.out.print("");
        else {
            System.out.print("GFG ");
            printGfg(n-1);
        }
    }
}