public class JadenCasingStrings {
  public static String toJadenCase(String phrase) throws NullPointerException {
    StringBuilder sb = new StringBuilder();
    String[] arr = phrase.split(" ");
    if (phrase == null || phrase.equals("")) return null;

    for (String i : arr) {
      sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1)).append(" ");
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    System.out.println(toJadenCase(""));
    System.out.println(toJadenCase(null));
  }
}
