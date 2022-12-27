public class FindIntegral {
  public static String integrate(int coefficient, int exponent) {
    int first = ++exponent;
    coefficient /= first;

    return coefficient + "x^" + first;
  }
}
