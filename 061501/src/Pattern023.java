public class Pattern023 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print((char)(64 + j));
      }
      System.out.println();
    }
  }
}
