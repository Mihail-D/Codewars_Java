public class You_reSquare {
  public static boolean isSquare(int n) {
    return Math.sqrt(n) % 1 == 0;
  }

  public static void main(String[] args) {
    System.out.println(isSquare(25));
    System.out.println(isSquare(26));
  }
}
