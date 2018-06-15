import java.util.Scanner;

public class Squaring {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Square from 1 to 20:");

        for (int i = 1; i < 21; i++) {
            System.out.println(i + "^2" + " = " + (i * i));
        }
    }
}
