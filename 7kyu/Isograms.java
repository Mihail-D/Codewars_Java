import java.util.Arrays;
import java.util.HashSet;

public class Isograms {
  public static boolean isIsogram(String str) {
    String [] array = str.toLowerCase().split("");
    HashSet<String> set = new HashSet<>(Arrays.asList(array));

    return array.length == set.size();
  }

  public static void main(String[] args) {
    System.out.println(isIsogram("Dermatoglyphics")); // true
    System.out.println(isIsogram("moOse")); // false
  }
}
