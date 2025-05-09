import java.util.Arrays;
import java.util.List;

public class SortMyTextbooks {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort(String.CASE_INSENSITIVE_ORDER);
    return textbooks;
  }

  public static void main(String[] args) {
    System.out.println(sort(Arrays.asList("Algebra", "History", "Geometry", "english")));
  }
}
