public class FormattingDecimal_0 {
  public static double TwoDecimalPlaces(double number) {

    return Math.round(number * 100.0) / 100.0;
  }

  public static void main(String[] args) {
    System.out.println(TwoDecimalPlaces(4.659725356));
  }
}
