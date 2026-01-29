// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

class Solution {
    public void printNos(int n) {
        // Code here
        if (n==1)
            System.out.print(1 + " ");
        else {
            printNos(n-1);
            System.out.print(n + " ");
        }
    }
}
