import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
