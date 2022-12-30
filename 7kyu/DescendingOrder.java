import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    /*    ArrayList<String> list = new ArrayList<>(List.of(("" + num).split("")));
    Collections.reverse(list);

    return Integer.parseInt(String.join("", list));*/

    String[] array = String.valueOf(num).split("");
    Arrays.sort(array, Collections.reverseOrder());
    return Integer.parseInt(String.join("", array));
  }

  public static void main(String[] args) {
    System.out.println(sortDesc(0112));
  }
}
