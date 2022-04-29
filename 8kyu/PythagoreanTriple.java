import java.util.Arrays;

public class PythagoreanTriple {
  public static int pythagoreanTriple(int[] triple) {
    Arrays.sort(triple);
    int i = (int) Math.pow(triple[2], 2);
    int x = (int) (Math.pow(triple[0], 2) + (int) Math.pow(triple[1], 2));

    return i == x ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(pythagoreanTriple(new int[] {3, 4, 5}));
  }
}
