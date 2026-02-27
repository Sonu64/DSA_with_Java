import java.util.*;
public class Two_D_ArrayLists {
    public static void main(String[] args) {
        List<List<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(10);
        a.add(20);
        b.add(30);
        b.add(40);
        mainList.add(a);
        mainList.add(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(mainList);
        System.out.println("\n\nIterating Using For-Each Loop...");
        for (List<Integer> list : mainList) {
            for (Integer number : list) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }
}
