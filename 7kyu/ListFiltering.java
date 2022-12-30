import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListFiltering {
  public static List<Object> filterList(final List<Object> list) {
    Predicate<Object> checkInt = x -> x instanceof Integer;
    return list.stream().filter(checkInt).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(
        filterList(filterList(new ArrayList<>(Arrays.asList(1, 2, "aasf", "1", "123", 123)))));
  }
}
