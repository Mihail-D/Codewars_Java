import java.math.BigInteger;

public class WilsonPrimes {
  public static boolean am_i_wilson(double n) {
    boolean result = false;

    BigInteger factorial = new BigInteger(String.valueOf(BigInteger.valueOf((long) (n - 1))));
    for (int i = 2; i <= n; i++) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }

    BigInteger wilsonPrimes =
        (factorial.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf((long) (n * n)));

    if (wilsonPrimes.equals(BigInteger.valueOf(5))
        || wilsonPrimes.equals(BigInteger.valueOf(13))
        || wilsonPrimes.equals(BigInteger.valueOf(563))) {
      result = true;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(am_i_wilson(5));
  }
}
