public class Pattern034Tree {
  public static void main(String[] args) {

    int lines = 5;
    int len = (lines * 2) - 1;
    int midpoint = (len / 2);

    for (int i = 0; i < lines; i++) {

      for (int j = 0; j < len; j++) {

        if (j == midpoint - i || j == midpoint + i || i == lines - 1) {
          System.out.print("*");
          } else {
        System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < len; j++) {
        if (j == midpoint) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}