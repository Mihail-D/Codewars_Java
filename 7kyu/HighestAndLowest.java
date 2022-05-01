import java.util.ArrayList;
import java.util.List;

public class HighestAndLowest {
  public static String highAndLow(String numbers) {
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    ArrayList<String> list = new ArrayList<>(List.of(numbers.split(" ")));

    for (String i : list) {
      if (Integer.parseInt(i) < min) {
        min = Integer.parseInt(i);
      }
      if (Integer.parseInt(i) > max) {
        max = Integer.parseInt(i);
      }
    }

    return "" + max + " " + min;
  }

  public static void main(String[] args) {
    System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")); // 42 -9
  }
}
