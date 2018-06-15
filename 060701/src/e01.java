import java.util.Scanner;

public class e01 {
    public static void main(String[] Strings) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
