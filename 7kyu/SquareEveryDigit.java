public class SquareEveryDigit {
  public static int squareDigits(int n) {
    String[] arr = (n + "").split("");
    String result = "";

    for (String i : arr) {
      result += Integer.parseInt(i) * Integer.parseInt(i);
    }

    return Integer.parseInt(result);
  }

  public static void main(String[] args) {
    System.out.println(squareDigits(9119));
  }
}
