public class binaryStrings {
    public static String binary_strings(int n, Integer last, int times) {
        if (n == 0)
            return "";
        else if (n == 1)
            return Integer.toString(last);
        else {

            if (last == 0) {
                if (times % 2 == 0)
                    System.out.print(last);
                if (times % 2 == 0)
                    return ((Integer.toString(last) + binary_strings(n - 1, 0, times + 1)) + " " + (Integer.toString(last) + binary_strings(n - 1, 1, times + 1)));
                else
                    return ((binary_strings(n - 1, 0, times + 1) + Integer.toString(last)) + " " + (binary_strings(n - 1, 1, times + 1) + Integer.toString(last)));
            }
                else
            if (times % 2 == 0)
                System.out.print(last);
                    if (times % 2 == 0)
                        return Integer.toString(last) + binary_strings(n - 1, 0, times+1);
                    else
                        return binary_strings(n - 1, 0, times+1) + Integer.toString(last);
        }
    }

    public static void main(String[] args) {
        System.out.print(binary_strings(3, 0, 1));
        System.out.print(", ");
        System.out.print(binary_strings(3, 1, 1));
    }
}
