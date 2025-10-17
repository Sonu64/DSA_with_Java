public class creatingArrays {
    public static void main(String[] args) {
        int marks[] = new int[5];
        // Assigning values to marks
        marks[0] = 10;
        marks[1] =  20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        int numbers[] = {34, 45, 31, 90, 43};
        String names[] = {"Sonu", "Shanu", "Shashikant", "Shobhit", "Mithu"};
        int emptyArray1[] = new int[5];
        String emptyArray2[] = new String[5];
        System.out.println("Marks Array - ");
        for(int i=0; i<5; i++)
            System.out.print(marks[i]+"\t");
        System.out.println("\nNumbers Array - ");
        for(int i=0; i<5; i++)
            System.out.print(numbers[i]+"\t");
        System.out.println("\nNames Array - ");
        for(int i=0; i<5; i++)
            System.out.print(names[i]+"\t");
        System.out.println("\nEmpty Integer Array - ");
        for(int i=0; i<5; i++)
            System.out.print(emptyArray1[i]+"\t");
        System.out.println("\nEmpty String Array - ");
        for(int i=0; i<5; i++)
            System.out.print(emptyArray2[i]+"\t");
    }
}
