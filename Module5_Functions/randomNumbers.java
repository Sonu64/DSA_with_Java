import java.util.Scanner;

public class randomNumbers {

    public static void generateRandomNumbers(int min, int max, int count) {
        while(count != 0) {
            int rand = min + (int) (Math.random() * (max - min + 1));
            System.out.print(rand+"\t");
            count--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min, max, count;
        System.out.print("Enter Lower Bound: ");
        min = in.nextInt();
        System.out.print("Enter Upper Bound: ");
        max = in.nextInt();
        System.out.print("How many Random numbers you want to generate between "+min+" "+max+": ");
        count = in.nextInt();
        generateRandomNumbers(min, max, count);
    }
}
