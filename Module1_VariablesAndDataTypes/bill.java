import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pencil, pen, eraser, total, gst = 0.18;

        System.out.print("Enter Pencil Price: ");
        pencil = in.nextDouble();

        System.out.print("Enter Pen Price: ");
        pen = in.nextDouble();   

        System.out.print("Enter Eraser Price: ");
        eraser = in.nextDouble();    

        total = (pencil + (pencil * gst)) + (pen + (pen * gst)) + (eraser + (eraser * gst));

        System.out.printf("Your total Bill including taxes is Rs. %.2f.", total);
    }
}
