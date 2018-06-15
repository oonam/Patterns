import java.util.Scanner;

public class e02 {

    public static void main(String[] Strings) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = in.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
