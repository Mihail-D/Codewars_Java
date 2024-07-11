public class CompareWithinMargin {
  public static int closeCompare(double a, double b, double margin) {
    return Math.abs(a - b) <= margin? 0 : a > b? 1 : -1;
  }

  public static int closeCompare(double a, double b) {
    return closeCompare(a,b,0);
  }

  public static void main(String[] args) {
    System.out.println(closeCompare(4, 5)); // -1
    System.out.println(closeCompare(5, 5)); //  1
    System.out.println(closeCompare(6, 5)); //  1
    System.out.println(closeCompare(2, 5, 3)); //  0
    System.out.println(closeCompare(8.1, 5, 3)); //  1
  }
}
// When a is close to b, return 0.
// When a is less than b, return -1.
// When a is greater than b, return 1.
// If margin is not given, treat it as zero.
