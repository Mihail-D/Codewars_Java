public class IsNumber {
  public static boolean isDigit(String s) {

    try {
      double d = Double.parseDouble(s);
    } catch (NumberFormatException nfe) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isDigit("s2324")); // f
    System.out.println(isDigit("  3  ")); // t
    System.out.println(isDigit("zero")); // f
    System.out.println(isDigit("2324")); // t
    System.out.println(isDigit("-3.23")); // t
  }
}
