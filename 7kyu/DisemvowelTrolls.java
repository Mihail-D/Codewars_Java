import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisemvowelTrolls {
  public static String disemvowel(String str) {
    ArrayList<String> list =
        new ArrayList<>(List.of(new String[] {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"}));
    ArrayList<String> newList = new ArrayList<>(Arrays.asList(str.split("")));

    newList.removeIf(list::contains);

    return String.join("", newList);
  }

  public static void main(String[] args) {
    System.out.println(disemvowel("This website is for losers LOL!"));
  }
}
