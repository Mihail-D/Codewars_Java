import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExesandOhs {
  public static boolean getXO(String str) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList(str.toLowerCase().split("")));
    Predicate<String> x = i -> i.equals("x");
    Predicate<String> o = j -> j.equals("o");

    ArrayList<String> listX = ((ArrayList<String>) list.stream().filter(x).collect(Collectors.toList()));
    ArrayList<String> listA = ((ArrayList<String>) list.stream().filter(o).collect(Collectors.toList()));

    return listX.size() == listA.size();
  }

  public static void main(String[] args) {
    System.out.println(getXO("xxxooo"));
    System.out.println(getXO("Xxxxertr34"));
    System.out.println(getXO("ooxXm"));
  }
}
