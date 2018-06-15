public class Pattern008 {
  public static void main(String[] args) {

    char i;
    char j;

    for (i = 'E'; i >= 'A' ; i--) {
      for (j = 0; j < 5; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
