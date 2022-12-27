import java.util.Collections;

public class Repeat_It {
  public static String repeatString(final Object toRepeat, final int n) {
    return (toRepeat instanceof String)
        ? new String(new char[n]).replace("\0", (CharSequence) toRepeat)
        : "Not a " + "string";
  }

  public static void main(String[] args) {
    System.out.println(repeatString(12, 11));
  }
}
