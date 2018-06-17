public class Pattern029 {
  public static void main(String[] args) {

    int len = 5;
    int space = 0;

    for (int i = 0; i < len; i++) {

      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }

      for (int k = space; k < len; k++) {
        System.out.print("*");
      }

      space++;
      System.out.println();
    }
  }
}
