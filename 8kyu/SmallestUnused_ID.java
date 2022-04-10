import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestUnused_ID {
  public static int nextId(int[] ids) {
    int smallest = ids.length;
    Arrays.sort(ids);

    for (int i = 0; i < ids.length; i++) {
      int finalI = i;
      if (IntStream.of(ids).noneMatch(x -> x == finalI)) {
        smallest = i;
        break;
      }
    }

    return smallest;
  }

  public static void main(String[] args) {
    System.out.println(nextId(new int[] {0, 1, 2, 3, 5}));
  }
}
