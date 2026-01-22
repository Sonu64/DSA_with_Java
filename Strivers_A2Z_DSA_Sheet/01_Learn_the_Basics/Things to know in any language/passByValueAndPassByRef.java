// https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value

public class passByValueAndPassByRef {
        static int[] passedBy(int a, int b) {
        // code here
        int[] arr = {a+1, b+2};
        return arr;
    }
}
