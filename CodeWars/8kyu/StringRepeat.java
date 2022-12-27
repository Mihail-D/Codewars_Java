import java.util.Collections;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return String.join("", Collections.nCopies(repeat, string));
    }
     public static void main(String[] args) {
          System.out.println(repeatStr(5, "Hello "));
      }
}
