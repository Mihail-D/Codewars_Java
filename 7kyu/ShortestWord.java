public class ShortestWord {
  public static int findShort(String s) {
    int result = Integer.MAX_VALUE;

    for (String i : s.split(" ")) {
      if (i.length() < result) {
        result = i.length();
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(
        findShort("turns out random test cases are easier than writing out basic ones")); // 3
  }
}
