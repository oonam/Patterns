public class Pattern024 {
  public static void main(String[] args) {

    int len = 5;
    int star = 1;

    for (int i = len-1; i >= 0; i--) {

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      for (int k = len-star; k < len; k++) {
        System.out.print("*");
      }

      System.out.println();
      star++;
    }
  }
}
