public class GetTheMiddleCharacter {
  public static String getMiddle(String word) {
    String[] arr = word.split("");
    double middle = arr.length / 2.0;

    return arr.length % 2 == 0
        ? arr[(int) middle - 1] + arr[(int) middle]
        : arr[(arr.length-1) / 2];
  }

  public static void main(String[] args) {
    System.out.println(getMiddle("test"));
    System.out.println(getMiddle("testing"));
  }
}
