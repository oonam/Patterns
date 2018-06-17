public class Pattern034Pyramid {
  public static void main(String[] args) {

    int lines = 5;
    int stars = 0;

    for (int i = 1; i <= lines; i++) {

      for (int j = 0; j < lines - i; j++) {
        System.out.print(" ");
      }

      for (int k = lines - i; k < lines; k++) {
        System.out.print("*");
      }

      for (int l = 0; l < i - 1; l++) {
        System.out.print("*");
      }

      stars++;
      System.out.println();
    }
  }
}