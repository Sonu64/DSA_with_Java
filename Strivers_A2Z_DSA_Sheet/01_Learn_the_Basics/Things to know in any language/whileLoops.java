// https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

class whileLoops {
    public void calculateMultiples(int n) {
        // code here
        int factor = 10;
        while(factor >= 1) {
            System.out.print(n * factor + " ");
            factor -= 1;
        }
    }
}