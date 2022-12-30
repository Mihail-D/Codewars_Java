import java.util.ArrayList;
import java.util.List;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        String[] arr = string.split("");
        List<String> list = new ArrayList<>(arr.length);
        for (String i : arr) {
          if (i.equals(i.toLowerCase())) {
              list.add(i.toUpperCase());
          }
          else if (i.equals(i.toUpperCase())) {
              list.add(i.toLowerCase());
          }
        }

        String joined = String.join("", list);

        return joined;
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));
        System.out.println(toAlternativeString("StringUtils.toAlternatingCase"));
    }
}
