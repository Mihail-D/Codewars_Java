import java.util.ArrayList;
import java.util.List;

public class VowelCount {
  public static int getCount(String str) {
    int vowelsCount = 0;
    ArrayList<String> list = new ArrayList<>(List.of(new String[]{"a", "e", "i", "o", "u"}));
    String[] arr = str.split("");

    for (String i : arr)
      if (list.contains(i)) {
        vowelsCount++;
      }

    return vowelsCount;
  }

  public static void main(String[] args) {
    System.out.println(getCount("abracadabra"));
  }
}
