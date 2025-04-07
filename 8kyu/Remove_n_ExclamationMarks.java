import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_n_ExclamationMarks {
  public static String remove(String s, int n) {
    List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));

    for (int i = 0; i < myList.size(); i++) {
      if (myList.get(i).equals("!") && n > 0) {
        myList.set(i, "");
        n--;
      }
    }
    return String.join("", myList);
  }

  public static void main(String[] args) {
    System.out.println(remove("!!!Hi !!hi!!! !hi", 1));
  }
}
